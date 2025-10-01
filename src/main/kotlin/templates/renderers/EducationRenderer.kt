package com.delonborges.templates.renderers

import com.delonborges.models.*
import kotlinx.html.*

object EducationRenderer {
    fun render(
        body: BODY,
        data: PortfolioData
    ) {
        body.section(classes = "education") {
            id = "education"
            attributes["aria-label"] = "Education"
            div(classes = "education-container") {
                h2(classes = "subtitle") { +"Education" }
                div {
                    renderEducationText()
                    renderEducationList(data.education)
                    renderEducationExtra(data)
                }
            }
        }
    }

    private fun DIV.renderEducationText() {
        p(classes = "education-text") {
            +"Bachelor's Degree in Information Systems from UNISINOS, complemented by continuous learning of modern "
            strong { +"best practices" }
            +", advanced "
            strong { +"techniques" }
            +" and innovative "
            strong { +"strategies" }
            +" in software development."
        }
    }

    private fun DIV.renderEducationList(education: Education) {
        ul(classes = "education-list") {
            li(classes = "education-item") {
                span(classes = "education-type") { +education.type }
                h3(classes = "education-course") { +education.course }
                span(classes = "education-institute") { +education.institute }
            }
        }
    }

    private fun DIV.renderEducationExtra(data: PortfolioData) {
        div(classes = "education-extra") {
            CoursesRenderer.render(this, data.courses)
            ProjectsRenderer.render(this, data.projects)
            LanguagesRenderer.render(this, data.languages)
        }
    }
}
