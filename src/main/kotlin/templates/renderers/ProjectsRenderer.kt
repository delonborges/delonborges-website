package com.delonborges.templates.renderers

import com.delonborges.models.Project
import kotlinx.html.*

object ProjectsRenderer {
    fun render(
        div: DIV,
        projects: List<Project>
    ) {
        div.div(classes = "education-extra-courses-projects") {
            h3 { +"Projects" }
            ul {
                projects.forEach { project ->
                    li {
                        a(href = project.url, target = "_blank") { +project.url }
                        span { +" / ${project.source}" }
                    }
                }
            }
        }
    }
}
