package com.delonborges.templates.styles

import kotlinx.css.*
import kotlinx.css.properties.LineHeight

object FooterStyle {
    fun CssBuilder.apply() {
        rule(".footer") {
            backgroundColor = Color("#000000")
        }

        rule(".footer-container") {
            maxWidth = 1200.px
            padding = Padding(120.px, 20.px, 60.px, 20.px)
            margin = Margin(0.px, LinearDimension.auto)
            display = Display.grid
            put("grid-template-columns", "1fr 1fr")
            put("gap", "60px")
            position = Position.relative
            alignItems = Align.center
        }

        rule(".footer-text") {
            fontSize = 1.5.rem
            lineHeight = LineHeight("1.33")
            color = Color("#cccccc")
        }

        rule(".footer-contact li") {
            fontWeight = FontWeight.bold
            fontSize = 1.75.rem
            lineHeight = LineHeight("1")
            color = Color("#ffffff")
            marginBottom = 20.px
        }

        rule(".footer-contact li a") {
            color = Color("#ffffff")
        }

        rule(".footer-copyright") {
            put("grid-column", "1 / -1")
            fontSize = 1.125.rem
            color = Color("#8f8f8f")
        }
    }
}
