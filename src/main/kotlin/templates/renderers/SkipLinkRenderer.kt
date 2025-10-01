package com.delonborges.templates.sections

import kotlinx.html.BODY
import kotlinx.html.a

object SkipLinkRenderer {
    fun render(body: BODY) {
        body.a(href = "#main-content", classes = "skip-link") {
            +"Skip to main content"
        }
    }
}
