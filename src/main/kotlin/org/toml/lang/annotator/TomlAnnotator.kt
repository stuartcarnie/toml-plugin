package org.toml.lang.annotator

import com.intellij.lang.annotation.AnnotationHolder
import com.intellij.lang.annotation.Annotator
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiWhiteSpace
import com.intellij.psi.util.PsiTreeUtil
import org.toml.lang.core.psi.TomlInlineTable

public class TomlAnnotator : Annotator {
    override fun annotate(element: PsiElement, holder: AnnotationHolder) {
        if (element is TomlInlineTable) {
            val whiteSpaces = PsiTreeUtil.findChildrenOfType(element, PsiWhiteSpace::class.java)
            if (whiteSpaces.any { '\n' in it.text }) {
                holder.createErrorAnnotation(element, "Inline tables are intended to appear on a single line")
            }
        }
    }
}
