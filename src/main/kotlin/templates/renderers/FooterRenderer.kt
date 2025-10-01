package com.delonborges.templates.sections

import com.delonborges.models.PersonalInfo
import kotlinx.html.*

object FooterRenderer {
    fun render(
        body: BODY,
        personalInfo: PersonalInfo
    ) {
        body.footer(classes = "footer") {
            id = "contact"
            div(classes = "footer-container") {
                p(classes = "footer-text") { +"You can reach me at: " }
                renderContactLinks(personalInfo)
                p(classes = "footer-copyright") { +"Delon Borges. Some rights reserved" }
            }
        }
    }

    private fun DIV.renderContactLinks(personalInfo: PersonalInfo) {
        ul(classes = "footer-contact") {
            contactLink("mailto:${personalInfo.email}", "email(@)delonborges.com")
            contactLink("https://github.com/delonborges", "github.com/delonborges")
            contactLink("https://www.linkedin.com/in/delonborges/", "linkedin.com/in/delonborges")
        }
    }

    private fun UL.contactLink(
        href: String,
        text: String
    ) {
        li {
            a(href = href) {
                attributes["rel"] = "noopener noreferrer"
                attributes["target"] = "_blank"
                +text
            }
        }
    }
}
