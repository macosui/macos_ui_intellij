package dev.groovinchip.macosintellij.groovinchip.macosuiintellij.services

import com.intellij.openapi.project.Project
import dev.groovinchip.macosintellij.groovinchip.macosuiintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
