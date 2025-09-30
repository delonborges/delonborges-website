package com.delonborges.templates.sections

import kotlinx.html.HEAD
import kotlinx.html.link

object ResourceLinksRenderer {
    fun render(head: HEAD) {
        head.apply {
            link(rel = "stylesheet", href = "/assets/styles/style.css")
            link(rel = "icon", type = "image/svg+xml", href = "/assets/images/logo.svg")
            renderGoogleFonts()
        }
    }

    private fun HEAD.renderGoogleFonts() {
        link(rel = "preconnect", href = "https://fonts.googleapis.com")
        link(rel = "preconnect", href = "https://fonts.gstatic.com") {
            attributes["crossorigin"] = ""
        }
        link(
            href = "https://fonts.googleapis.com/css2?family=Fira+Sans:wght@300;400;500;600;700&display=swap", rel = "stylesheet"
        )
    }
}
