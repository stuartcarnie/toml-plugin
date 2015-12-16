package org.toml.lang.core.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.toml.lang.TomlFileType
import org.toml.lang.TomlLanguage

class TomlFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, TomlLanguage) {
    override fun getFileType(): FileType =
            TomlFileType

    override fun toString(): String =
            "TOML File"
}
