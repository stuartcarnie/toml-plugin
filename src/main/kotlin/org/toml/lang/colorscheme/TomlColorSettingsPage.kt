package org.toml.lang.colorscheme

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import com.intellij.openapi.util.io.StreamUtil
import org.toml.lang.TomlHighlighter
import org.toml.lang.icons.TomlIcons

public class TomlColorSettingsPage : ColorSettingsPage {
    private fun d(displayName: String, key: TextAttributesKey) = AttributesDescriptor(displayName, key)
    private val ATTRS = arrayOf(
            d("Key", TomlColors.KEY),
            d("String", TomlColors.STRING),
            d("Number", TomlColors.NUMBER),
            d("Boolean", TomlColors.BOOLEAN),
            d("Date", TomlColors.DATE),
            d("Line comment", TomlColors.LINE_COMMENT),
            d("Brackets", TomlColors.BRACKETS),
            d("Braces", TomlColors.BRACES),
            d("Comma", TomlColors.COMMA)
    )

    // This tags should be kept in sync with RustAnnotator highlighting logic
    private val DEMO_TEXT by lazy {
        val stream = javaClass.classLoader.getResourceAsStream("org/toml/lang/colorscheme/highlighterDemoText.toml")
        StreamUtil.readText(stream, "UTF-8")
    }

    override fun getDisplayName() = "Toml"
    override fun getIcon() = TomlIcons.TOML
    override fun getAttributeDescriptors() = ATTRS
    override fun getColorDescriptors() = ColorDescriptor.EMPTY_ARRAY
    override fun getHighlighter() = TomlHighlighter()
    override fun getAdditionalHighlightingTagToDescriptorMap() = null
    override fun getDemoText() = DEMO_TEXT
}
