package org.toml.lang.colorscheme

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey

object TomlColors {
    private fun r(id: String, attrKey: TextAttributesKey) =
            TextAttributesKey.createTextAttributesKey(id, attrKey)

    val KEY = r("org.toml.KEY", DefaultLanguageHighlighterColors.KEYWORD)

    val STRING = r("org.toml.STRING", DefaultLanguageHighlighterColors.STRING)
    val NUMBER = r("org.toml.NUMBER", DefaultLanguageHighlighterColors.NUMBER)
    val BOOLEAN = r("org.toml.BOOLEAN", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL)
    val DATE = r("org.toml.DATE", DefaultLanguageHighlighterColors.PREDEFINED_SYMBOL)

    val LINE_COMMENT = r("org.toml.LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)

    val BRACKETS = r("org.toml.BRACKETS", DefaultLanguageHighlighterColors.BRACKETS)
    val BRACES = r("org.toml.BRACES", DefaultLanguageHighlighterColors.BRACES)

    val COMMA = r("org.toml.COMMA", DefaultLanguageHighlighterColors.COMMA)

}
