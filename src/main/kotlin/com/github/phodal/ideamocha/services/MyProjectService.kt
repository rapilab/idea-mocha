package com.github.phodal.ideamocha.services

import com.github.phodal.ideamocha.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
