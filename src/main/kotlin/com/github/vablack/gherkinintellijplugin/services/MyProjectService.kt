package com.github.vablack.gherkinintellijplugin.services

import com.intellij.openapi.project.Project
import com.github.vablack.gherkinintellijplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
