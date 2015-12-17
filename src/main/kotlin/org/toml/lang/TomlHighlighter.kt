package org.toml.lang

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType
import gnu.trove.THashMap
import org.toml.lang.colorscheme.TomlColors
import org.toml.lang.core.lexer.TomlLexer
import org.toml.lang.core.psi.TomlTypes


class TomlHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer =
            TomlLexer()


    override fun getTokenHighlights(tokenType: IElementType?): Array<out TextAttributesKey> =
            SyntaxHighlighterBase.pack(tokenMap.getRaw(tokenType))


    private val tokenMap: Map<IElementType, TextAttributesKey> = makeTokenMap()

}

private fun makeTokenMap(): Map<IElementType, TextAttributesKey> {
    val result = THashMap<IElementType, TextAttributesKey>()

    result[TomlTypes.KEY] = TomlColors.KEY

    result[TomlTypes.COMMENT] = TomlColors.LINE_COMMENT

    result[TomlTypes.STRING] = TomlColors.STRING

    result[TomlTypes.NUMBER] = TomlColors.NUMBER

    result[TomlTypes.BOOLEAN] = TomlColors.BOOLEAN

    result[TomlTypes.DATE] = TomlColors.DATE

    result[TomlTypes.LBRACKET] = TomlColors.BRACKETS
    result[TomlTypes.RBRACKET] = TomlColors.BRACKETS
    result[TomlTypes.LBRACE] = TomlColors.BRACES
    result[TomlTypes.RBRACE] = TomlColors.BRACES

    return result;
}

