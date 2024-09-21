package Ninja.coder.Ghostemane.code.adapter;

import Ninja.coder.Ghostemane.code.IdeEditor;
import Ninja.coder.Ghostemane.code.R;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.flask.colorpicker.ColorPickerView;
import com.flask.colorpicker.builder.ColorPickerDialogBuilder;

import java.util.ArrayList;
import java.util.HashMap;

public class ThemeAdapter extends RecyclerView.Adapter<ThemeAdapter.ViewHolder> {
  private ArrayList<HashMap<String, Object>> listMap;
  private IdeEditor editor;

  public ThemeAdapter(ArrayList<HashMap<String, Object>> listMap,IdeEditor editor) {
    this.listMap = listMap;
    this.editor = editor;
  }

  @NonNull
  @Override
  public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
    View view =
        LayoutInflater.from(parent.getContext())
            .inflate(R.layout.layout_colorselect, parent, false);
    return new ViewHolder(view);
  }

  @Override
  public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
    HashMap<String, Object> currentItem = listMap.get(position);

    holder.id.setText(currentItem.get("key").toString());
    holder.sub.setBackground(db(currentItem.get("hex").toString()));
    holder.tv.setText(currentItem.get("hex").toString());

    holder.itemView.setOnClickListener(
        v -> {
          ColorPickerDialogBuilder.with(holder.tv.getContext())
              .setTitle("Colors")
              .initialColor(Color.parseColor(holder.tv.getText().toString()))
              .wheelType(ColorPickerView.WHEEL_TYPE.CIRCLE)
              .density(12)
              .setOnColorSelectedListener(colorviews -> {})
              .setPositiveButton(
                  "ok",
                  (in, colorview, allcolos) -> {
                    String colors = Integer.toHexString(colorview);
                    holder.tv.setText("#" + colors);
                    holder.sub.setBackground(db("#" + colors));
                    Handler handler = new Handler(Looper.getMainLooper());
                    handler.postDelayed(
                        () -> {
                          listMap.get(position).put("hex", holder.tv.getText().toString());
                          
                          notifyDataSetChanged();
                        },
                        100);
                  })
              .build()
              .show();
        });
  }

  @Override
  public int getItemCount() {
    return listMap.size();
  }

  protected GradientDrawable db(String color) {
    GradientDrawable colors = new GradientDrawable();
    colors.setColor(Color.parseColor(color));
    colors.setCornerRadius(15);
    return colors;
  }

  public static class ViewHolder extends RecyclerView.ViewHolder {
    LinearLayout sub;
    TextView tv;
    TextView id;

    public ViewHolder(@NonNull View itemView) {
      super(itemView);
      sub = itemView.findViewById(R.id.colorviews);
      tv = itemView.findViewById(R.id.name);
      id = itemView.findViewById(R.id.idcolor);
    }
  }
}