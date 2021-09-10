package com.github.kishoretulsiani.helloworldplugin.services

import com.intellij.openapi.project.Project
import com.github.kishoretulsiani.helloworldplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
