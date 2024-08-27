package io.github.rosemoe.sora.langs.svg;

import io.github.rosemoe.sora.interfaces.AutoCompleteProvider;
import io.github.rosemoe.sora.interfaces.CodeAnalyzer;
import io.github.rosemoe.sora.interfaces.EditorLanguage;
import io.github.rosemoe.sora.interfaces.NewlineHandler;
import io.github.rosemoe.sora.langs.html.HTMLAnalyzerCompat;
import io.github.rosemoe.sora.widget.SymbolPairMatch;

public class SvgLang implements EditorLanguage {

  @Override
  public CharSequence format(CharSequence text) {
    return text;
  }

  @Override
  public CodeAnalyzer getAnalyzer() {
    return new HTMLAnalyzerCompat();
  }

  @Override
  public AutoCompleteProvider getAutoCompleteProvider() {
    return null;
  }

  @Override
  public int getIndentAdvance(String content) {
    return 0;
  }

  @Override
  public NewlineHandler[] getNewlineHandlers() {
    return null;
  }

  @Override
  public SymbolPairMatch getSymbolPairs() {
    return null;
  }

  @Override
  public boolean isAutoCompleteChar(char ch) {
    return false;
  }

  @Override
  public boolean useTab() {
    return false;
  }
}