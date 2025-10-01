package com.delonborges.templates.styles

import kotlinx.html.HEAD
import kotlinx.html.link

object GlobalStyle {
    fun render(head: HEAD) {
        head.link(rel = "stylesheet", href = "/styles/base.css", type = "text/css")
        head.link(rel = "stylesheet", href = "/styles/header.css", type = "text/css")
        head.link(rel = "stylesheet", href = "/styles/introduction.css", type = "text/css")
        head.link(rel = "stylesheet", href = "/styles/experience.css", type = "text/css")
        head.link(rel = "stylesheet", href = "/styles/education.css", type = "text/css")
        head.link(rel = "stylesheet", href = "/styles/footer.css", type = "text/css")
        head.link(rel = "stylesheet", href = "/styles/responsive.css", type = "text/css")
    }
}
