package com.delonborges.templates.sections

import com.delonborges.models.Course
import kotlinx.html.*

object CoursesRenderer {
    fun render(
        div: DIV,
        courses: List<Course>
    ) {
        div.div(classes = "education-extra-courses") {
            h3 { +"Courses" }
            ul {
                courses.forEach { course ->
                    li {
                        +course.name
                        span { +course.duration }
                    }
                }
            }
        }
    }
}
