package com.delonborges.templates.renderers

import kotlinx.html.*

object HeaderRenderer {
    fun render(body: BODY) {
        body.header(classes = "header") {
            renderLogo()
            renderNavigation()
        }
    }

    private fun HEADER.renderLogo() {
        a(href = "#main-content") {
            attributes["aria-label"] = "Delon Borges - Software Engineer"
            img(alt = "Delon Borges Logo", src = "/assets/images/logo.svg") {
                width = "120"
                height = "40"
            }
        }
    }

    private fun HEADER.renderNavigation() {
        nav {
            attributes["aria-label"] = "Main navigation"
            ul(classes = "header-menu") {
                menuItem("#experience", "Experience")
                menuItem("#education", "Education")
                menuItem("#contact", "Contact")
            }
        }
    }

    private fun UL.menuItem(
        href: String,
        text: String
    ) {
        li {
            a(href = href) { +text }
        }
    }
}
