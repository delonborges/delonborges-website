package com.delonborges.templates.sections

import com.delonborges.models.Experience
import kotlinx.html.*

object ExperienceRenderer {
    fun render(
        body: BODY,
        experiences: List<Experience>
    ) {
        body.section(classes = "experience") {
            id = "experience"
            attributes["aria-label"] = "Experience"
            h2(classes = "subtitle") { +"Experience" }
            div {
                renderIntroText()
                experiences.forEach { renderExperienceItem(it) }
            }
        }
    }

    private fun DIV.renderIntroText() {
        p(classes = "experience-text") {
            +"I'm a passionate "
            strong { +"software engineer" }
            +" with expertise in backend development and quality assurance, continuously expanding my "
            strong { +"knowledge" }
            +" and skills in modern software development practices and technologies."
        }
    }

    private fun DIV.renderExperienceItem(experience: Experience) {
        div(classes = "company") {
            span(classes = "company-year") { +experience.year }
            h3(classes = "company-title") { +experience.company }
            span(classes = "company-title") { +experience.position }
            p(classes = "company-text") { +experience.description }
            renderSkills(experience.skills)
        }
    }

    private fun DIV.renderSkills(skills: List<String>) {
        ul(classes = "company-skills") {
            skills.forEach { skill ->
                li { +skill }
            }
        }
    }
}
