package Ninja.coder.Ghostemane.code.utils;

import Ninja.coder.Ghostemane.code.marco.ColorCompat;
import Ninja.coder.Ghostemane.code.utils.ColorAndroid12;
import Ninja.coder.Ghostemane.code.utils.SetThemeForJson;
import Ninja.coder.Ghostemane.code.widget.ExrtaFab;
import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.blankj.utilcode.util.FileIOUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.skydoves.powermenu.PowerMenu;
import io.github.rosemoe.sora.text.TextStyle;
import io.github.rosemoe.sora.widget.CodeEditor;
import io.github.rosemoe.sora.widget.EditorColorScheme;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.TreeMap;

public class SetThemeForJson {
  protected HashMap<String, Object> map = new HashMap<>();
  private Timer timer = new Timer();
  private TimerTask task;

  public SetThemeForJson() {}

  public SetThemeForJson(HashMap<String, Object> maps) {
    this.map = maps;
  }

  public SetThemeForJson setShowTheme() {
    if (map.containsKey("Title")) {
      map.put("Title", Color.parseColor("#FF84A9FF"));
    } else {
      map.put("Title", Color.BLUE);
    }
    if (map.containsKey("BackGround")) {
      map.put("BackGround", Color.parseColor("#FFFF84FA"));
    } else {
      map.put("BackGround", Color.DKGRAY);
    }
    return this;
  }

  public SetThemeForJson setThemeCodeEditor(
      CodeEditor editor, HashMap<String, Object> imap, boolean chackHashMap, Activity x) {

    getColor(imap, editor, "block_line", EditorColorScheme.BLOCK_LINE, "#ff28ffae");
    getColor(imap, editor, "OPERATOR", EditorColorScheme.OPERATOR, "#ff43ffd5");
    getColor(imap, editor, "block_line_current", EditorColorScheme.BLOCK_LINE_CURRENT, "#ff28ffae");
    getColor(imap, editor, "non_printable_char", EditorColorScheme.NON_PRINTABLE_CHAR, "#ffa10370");
    getColor(imap, editor, "current_line", EditorColorScheme.CURRENT_LINE, "#ff6b90ff");
    getColor(imap, editor, "selection_handle", EditorColorScheme.SELECTION_HANDLE, "#ff2a6373");
    getColor(imap, editor, "line_number", EditorColorScheme.LINE_NUMBER, "#ffff0017");
    getColor(imap, editor, "line_divider", EditorColorScheme.LINE_DIVIDER, "#1d000000");
    getColor(imap, editor, "attribute_value", EditorColorScheme.ATTRIBUTE_VALUE, "#ffa6ffa1");
    getColor(imap, editor, "attribute_name", EditorColorScheme.ATTRIBUTE_NAME, "#ffff1723");
    getColor(imap, editor, "text_normal", EditorColorScheme.TEXT_NORMAL, "#ffffffff");
    getColor(imap, editor, "identifier_name", EditorColorScheme.IDENTIFIER_NAME, "#501910");
    getColor(imap, editor, "comment", EditorColorScheme.COMMENT, "#424242");
    getColor(imap, editor, "keyword", EditorColorScheme.KEYWORD, "#ff1081");
    getColor(imap, editor, "print", EditorColorScheme.print, "#ffa801");
    getColor(imap, editor, "ninja", EditorColorScheme.Ninja, "#ffe200");
    getColor(imap, editor, "auto_comp_panel_bg", EditorColorScheme.AUTO_COMP_PANEL_BG, "#ff000000");
    getColor(
        imap,
        editor,
        "auto_comp_panel_corner",
        EditorColorScheme.AUTO_COMP_PANEL_CORNER,
        "#fffffffd");
    getColor(
        imap,
        editor,
        "line_number_background",
        EditorColorScheme.LINE_NUMBER_BACKGROUND,
        "#fff00000");
    getColor(imap, editor, "whole_background", EditorColorScheme.WHOLE_BACKGROUND, "#02FFFFFF");
    getColor(imap, editor, "html_tag", EditorColorScheme.HTML_TAG, "#ffc84100");
    getColor(imap, editor, "literal", EditorColorScheme.LITERAL, "#ff2017");

    getColor(imap, editor, "print", EditorColorScheme.SCROLL_BAR_THUMB, "#ff3500");
    getColor(imap, editor, "ninja", EditorColorScheme.SCROLL_BAR_THUMB_PRESSED, "#ffacd9");
    getColor(
        imap, editor, "auto_comp_panel_corner", EditorColorScheme.SCROLL_BAR_TRACK, "#ffee3201");
    getColor(imap, editor, "javakeyword", EditorColorScheme.javakeyword, "#592370");
    getColor(imap, editor, "javaoprator", EditorColorScheme.javaoprator, "#672907");
    getColor(imap, editor, "javafun", EditorColorScheme.javafun, "#592370");
    getColor(imap, editor, "javafield", EditorColorScheme.javafield, "#672907");
    getColor(imap, editor, "javatype", EditorColorScheme.javatype, "#337291");
    getColor(imap, editor, "javaparament", EditorColorScheme.javaparament, "#336108");
    getColor(imap, editor, "javanumber", EditorColorScheme.javanumber, "#ff620a");
    getColor(imap, editor, "javastring", EditorColorScheme.javastring, "#ff7dd1");

    getColor(imap, editor, "htmltag", EditorColorScheme.htmltag, "#ff6060");
    getColor(imap, editor, "htmlattr", EditorColorScheme.htmlattr, "#4fc3f7"); 
    getColor(
        imap, editor, "htmlattrname", EditorColorScheme.htmlattrname, "#ffab40"); 
    getColor(imap, editor, "htmlstr", EditorColorScheme.htmlstr, "#81c784"); 
    getColor(imap, editor, "csskeyword", EditorColorScheme.csskeyword, "#64b5f6"); 
    getColor(imap, editor, "htmlsymbol", EditorColorScheme.htmlsymbol, "#ba68c8"); 
    getColor(imap, editor, "htmlblockhash", EditorColorScheme.htmlblockhash, "#ff7043"); 
    getColor(
        imap,
        editor,
        "htmlblocknormal",
        EditorColorScheme.htmlblocknormal,
        "#90caf9"); 
    getColor(imap, editor, "jskeyword", EditorColorScheme.jskeyword, "#64b5f6"); 
    getColor(imap, editor, "jsfun", EditorColorScheme.jsfun, "#ffd54f"); 
    getColor(imap, editor, "jsoprator", EditorColorScheme.jsoprator, "#4db6ac"); 
    getColor(imap, editor, "jsattr", EditorColorScheme.jsattr, "#ffab40"); 
    getColor(imap, editor, "jsstring", EditorColorScheme.jsstring, "#81c784"); 

    getColor(imap, editor, "pystring", EditorColorScheme.pystring, "#ff7d51");
    getColor(imap, editor, "pykeyword", EditorColorScheme.pykeyword, "#51ff7d");
    getColor(imap, editor, "pysymbol", EditorColorScheme.pysymbol, "#7d51ff");
    getColor(imap, editor, "pynumber", EditorColorScheme.pynumber, "#ff51ec");
    getColor(imap, editor, "pycolormatch1", EditorColorScheme.pycolormatch1, "#ffd151");
    getColor(imap, editor, "pycolormatch2", EditorColorScheme.pycolormatch2, "#51d1ff");
    getColor(imap, editor, "pycolormatch3", EditorColorScheme.pycolormatch3, "#51ff92");
    getColor(imap, editor, "pycolormatch4", EditorColorScheme.pycolormatch4, "#ff51a2");

    editor.getColorScheme().setColor(EditorColorScheme.red, ColorCompat.RED);
    editor.getColorScheme().setColor(EditorColorScheme.aliceblue, ColorCompat.ALICEBLUE);

    editor.getColorScheme().setColor(EditorColorScheme.antiquewhite, ColorCompat.ANTIQUEWHITE);
    editor.getColorScheme().setColor(EditorColorScheme.aqua, ColorCompat.AQUA);
    editor.getColorScheme().setColor(EditorColorScheme.aquamarine, ColorCompat.AQUAMARINE);
    editor.getColorScheme().setColor(EditorColorScheme.azure, ColorCompat.AZURE);
    editor.getColorScheme().setColor(EditorColorScheme.beige, ColorCompat.BEIGE);
    editor.getColorScheme().setColor(EditorColorScheme.bisque, ColorCompat.BISQUE);
    editor.getColorScheme().setColor(EditorColorScheme.black, ColorCompat.BLACK);
    editor.getColorScheme().setColor(EditorColorScheme.blanchedalmond, ColorCompat.BLANCHEDALMOND);
    editor.getColorScheme().setColor(EditorColorScheme.blue, ColorCompat.BLUE);
    editor.getColorScheme().setColor(EditorColorScheme.blueviolet, ColorCompat.BLUEVIOLET);
    editor.getColorScheme().setColor(EditorColorScheme.brown, ColorCompat.BROWN);
    editor.getColorScheme().setColor(EditorColorScheme.white, ColorCompat.WHITE);

    editor.getColorScheme().setColor(EditorColorScheme.COLOR_DEBUG, Color.BLUE);
    editor.getColorScheme().setColor(EditorColorScheme.COLOR_ERROR, Color.RED);
    editor.getColorScheme().setColor(EditorColorScheme.COLOR_WARNING, Color.YELLOW);
    editor.getColorScheme().setColor(EditorColorScheme.COLOR_LOG, Color.GREEN);
    editor.getColorScheme().setColor(EditorColorScheme.COLOR_TIP, Color.CYAN);

    return this;
  }

  protected void getColor(
      HashMap<String, Object> imap,
      CodeEditor editor,
      String key,
      int colorValue,
      String colorNull) {
    editor
        .getColorScheme()
        .setColor(
            imap.containsKey(key) ? colorValue : Color.parseColor(colorNull),
            imap.containsKey(key)
                ? Color.parseColor(imap.get(key).toString())
                : Color.parseColor(colorNull));
  }

  public SetThemeForJson setHashMapInabel(boolean isEnabel, HashMap<String, Object> imap) {
    if (isEnabel) {
      isEnabel = true;
      imap = new HashMap<>();
    } else {
      isEnabel = false;
      imap = null;
    }

    return this;
  }

  @Deprecated
  private SetThemeForJson dialogError(Activity x) {

    return this;
  }

  public SetThemeForJson AddthemetoSattos(Activity a, HashMap<String, Object> imap) {

    if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
      Window Hsi = a.getWindow();
      Hsi.setStatusBarColor(
          imap.containsKey("backgroundcolorlinear")
              ? Color.parseColor(imap.get("backgroundcolorlinear").toString())
              : Color.parseColor("#FF281B26"));
    }

    return this;
  }

  public SetThemeForJson addTextColor(
      TextView id, String datatype, int color, Activity x, HashMap<String, Object> imap2) {
    id.setTextColor(
        imap2.containsKey(datatype)
            ? Color.parseColor(imap2.get(datatype).toString())
            : 0xFFFFE5FC);
    return this;
  }

  public SetThemeForJson addBackground(
      Activity c, HashMap<String, Object> imap, String datatype, View object, int color) {
    object.setBackgroundColor(
        imap.containsKey(datatype) ? Color.parseColor(imap.get(datatype).toString()) : 0xFF281B26);

    return this;
  }

  public SetThemeForJson addImageColor(
      ImageView id, Activity c, String datatype, HashMap<String, Object> map, int color) {
    id.setColorFilter(
        map.containsKey(datatype) ? Color.parseColor(map.get(datatype).toString()) : 0xFFDE7CD1,
        PorterDuff.Mode.MULTIPLY);

    return this;
  }

  public SetThemeForJson setFabBackground(
      ExtendedFloatingActionButton fab, HashMap<String, Object> map) {
    fab.setIconTint(
        ColorStateList.valueOf(
            map.containsKey("fabimagecolor")
                ? Color.parseColor(map.get("fabimagecolor").toString())
                : MaterialColors.getColor(fab, ColorAndroid12.TvColor)));
    return this;
  }

  public SetThemeForJson setFabColorHint(
      ExtendedFloatingActionButton fab, HashMap<String, Object> imap) {
    fab.setBackgroundTintList(
        ColorStateList.valueOf(
            map.containsKey("fabbackgroundcolorcolor")
                ? Color.parseColor(map.get("fabbackgroundcolorcolor").toString())
                : MaterialColors.getColor(fab, ColorAndroid12.Back)));

    return this;
  }

  public SetThemeForJson subPowerMenu(PowerMenu menu, HashMap<String, Object> map) {
    menu.setTextColor(
        map.containsKey("toolbartextcolor")
            ? Color.parseColor(map.get("toolbartextcolor").toString())
            : Color.parseColor("#fff"));
    menu.setMenuColor(
        map.containsKey("menubackground")
            ? Color.parseColor(map.get("menubackground").toString())
            : Color.parseColor("#ff000000"));
    menu.setIconColor(
        map.containsKey("tabimagecolorfilter")
            ? Color.parseColor(map.get("tabimagecolorfilter").toString())
            : Color.parseColor("#fff472"));

    return this;
  }

  public SetThemeForJson buildandpost() {

    return this;
  }

  public static void winterToPath() {
    Map<String, String> map = new HashMap<>();
    map.put("toolbartextcolor", "#B0BEC5"); 
    map.put("block_line_current", "#4DD0E1"); 
    map.put("line_divider", "#4B4B4B"); 
    map.put("syombolbartextcolor", "#B0BEC5"); 
    map.put("html_tag", "#80CBC4"); 
    map.put("fabcolorstroker", "#4DFFFFFF"); 
    map.put("line_number", "#B0BEC5"); 
    map.put("keyword", "#FFAB40"); 
    map.put("auto_comp_panel_corner", "#FF8A65"); 
    map.put("selection_handle", "#66BB6A"); 
    map.put("tabimagecolorfilter", "#B0BEC5"); 
    map.put("auto_comp_panel_bg", "#263238"); 
    map.put("comment", "#757575"); 
    map.put("toolbarcolor", "#121212"); 
    map.put("identifier_name", "#FF9E80"); 
    map.put("displaytextcolortab", "#FFD54F"); 
    map.put("non_printable_char", "#90CAF9"); 
    map.put("selection_insert", "#4DB6AC"); 
    map.put("ninja", "#E1BEE7"); 
    map.put("textcolorhder", "#FFAB91"); 
    map.put("tabtextcolor", "#B0BEC5"); 
    map.put("block_line", "#81D4FA"); 
    map.put("menubackground", "#1E1E1E"); 
    map.put("literal", "#64B5F6"); 
    map.put("fabbackgroundcolorcolor", "#1E1E1E"); 
    map.put("attribute_value", "#80DEEA"); 
    map.put("tabback", "#1C1C1C"); 
    map.put("textcolorforgrand", "#B0BEC5"); 
    map.put("imagecolor", "#B0BEC5"); 
    map.put("text_normal", "#FFFFFF"); 
    map.put("attribute_name", "#64B5F6"); 
    map.put("print", "#FF8A65"); 
    map.put("operator", "#FFB74D"); 
    map.put("current_line", "#37474F"); 
    map.put("whole_background", "#1E1E1E"); 
    map.put("backgroundcolorlinear", "#1c1c1c"); 
    map.put("fabimagecolor", "#B0BEC5"); 
    map.put("line_number_background", "#1E1E1E"); 
    map.put("textcolorigor", "#F06292"); 
    map.put("textcolorinier", "#EF5350"); 
    map.put("javakeyword", "#FFAC80"); 
    map.put("javaoprator", "#90CAF9"); 
    map.put("javafun", "#FFCC60"); 
    map.put("javafield", "#FFAB60"); 
    map.put("javatype", "#64B5F6"); 
    map.put("javaparament", "#FFAB40"); 
    map.put("javanumber", "#A5D6A7"); 
    map.put("javastring", "#E0E0E0"); 
    map.put("htmltag", "#FFAB49"); 
    map.put("htmlattr", "#FFAB80"); 
    map.put("htmlattrname", "#64B5F6"); 
    map.put("htmlstr", "#FFCC80"); 
    map.put("csskeyword", "#81D4FA"); 
    map.put("htmlsymbol", "#FF33A8"); 
    map.put("htmlblockhash", "#FF5252"); 
    map.put("htmlblocknormal", "#FF4081"); 
    map.put("jskeyword", "#FFAB40"); 
    map.put("jsfun", "#FFCC80");
    map.put("jsoprator", "#FF5252"); 
    map.put("jsattr", "#64B5F6"); 
    map.put("jsstring", "#FFCC80"); 
    map.put("pystring", "#FFCC80"); 
    map.put("pykeyword", "#FFAB40"); 
    map.put("pysymbol", "#64B5F6"); 
    map.put("pynumber", "#A5D6A7"); 
    map.put("pycolormatch1", "#FFFF33"); 
    map.put("pycolormatch2", "#33FFFF"); 
    map.put("pycolormatch3", "#FF33FF"); 
    map.put("pycolormatch4", "#FFC300"); 
    String path =
        FileUtil.getExternalStorageDir()
            + File.separator
            + "GhostWebIDE"
            + File.separator
            + "theme"
            + File.separator
            + "GhostThemeapp.ghost";
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    FileIOUtils.writeFileFromString(path, gson.toJson(map));

    Map<String, Boolean> StyleText = new HashMap<>();
    StyleText.put("isBold", true);
    StyleText.put("isItalic", false);
    StyleText.put("isStrike", false);
    StyleText.put("isLine", false);
    var customPath =
        FileUtil.getExternalStorageDir()
            + File.separator
            + "GhostWebIDE"
            + File.separator
            + "theme"
            + File.separator
            + "style.ghost";
    Gson styleGson = new GsonBuilder().setPrettyPrinting().create();
    FileIOUtils.writeFileFromString(customPath, gson.toJson(StyleText));
  }

  public static void LoadStyle(Map<String, Boolean> map) {
    map = new Gson().fromJson(setReloadStyle(), new TypeToken<Map<String, Boolean>>() {}.getType());
  }

  public static String setReloadTheme() {
    return FileUtil.readFile(
        FileUtil.getExternalStorageDir()
            + File.separator
            + "GhostWebIDE"
            + File.separator
            + "theme"
            + File.separator
            + "style.ghost");
  }

  public static String setReloadStyle() {
    return FileUtil.readFile(
        FileUtil.getExternalStorageDir()
            + File.separator
            + "GhostWebIDE"
            + File.separator
            + "theme"
            + File.separator
            + "style.ghost");
  }
}
