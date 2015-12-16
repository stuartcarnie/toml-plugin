package org.toml.lang.actions

import com.intellij.ide.actions.CreateFileFromTemplateAction
import com.intellij.ide.actions.CreateFileFromTemplateDialog
import com.intellij.openapi.project.DumbAware
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import org.toml.lang.icons.TomlIcons

private val NEW_TOML_FILE = "New TOML File"

class TomlCreateFileAction : CreateFileFromTemplateAction(NEW_TOML_FILE, "", TomlIcons.TOML)
                           , DumbAware {

    override fun getActionName(directory: PsiDirectory?, newName: String?, templateName: String?): String {
        return NEW_TOML_FILE
    }

    override fun buildDialog(project: Project?, directory: PsiDirectory?,
                             builder: CreateFileFromTemplateDialog.Builder) {
        builder.setTitle(NEW_TOML_FILE)
                .addKind("Empty File", TomlIcons.TOML, "TOML File")
    }
}
