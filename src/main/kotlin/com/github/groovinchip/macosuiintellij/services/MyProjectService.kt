package com.github.groovinchip.macosuiintellij.services

import com.intellij.openapi.project.Project
import com.github.groovinchip.macosuiintellij.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
