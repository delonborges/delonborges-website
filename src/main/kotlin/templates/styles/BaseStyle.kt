package com.delonborges.templates.styles

import kotlinx.css.*
import kotlinx.css.properties.LineHeight
import kotlinx.css.properties.TextDecoration

object BaseStyle {
    fun CssBuilder.apply() {
        body {
            fontFamily = "'Fira Sans', Arial, sans-serif"
            margin = Margin(0.px)
            color = Color("#141414")
            backgroundColor = Color("#cccccc")
        }

        rule(".skip-link") {
            position = Position.absolute
            top = (-40).px
            left = 6.px
            backgroundColor = Color("#141414")
            color = Color.white
            padding = Padding(8.px)
            textDecoration = TextDecoration.none
            borderRadius = 4.px
            fontSize = 0.875.rem
            zIndex = 1000
            put("transition", "top 0.3s")
        }

        rule(".skip-link:focus") {
            top = 6.px
        }

        rule("h1, h2, h3, p") {
            margin = Margin(0.px)
        }

        rule("ul") {
            margin = Margin(0.px)
            padding = Padding(0.px)
            listStyleType = ListStyleType.none
        }

        rule("img") {
            maxWidth = 100.pct
            height = LinearDimension.auto
            display = Display.block
        }

        rule(".subtitle") {
            fontSize = 8.rem
            lineHeight = LineHeight("1")
            textTransform = TextTransform.uppercase
            put("word-break", "break-all")
            put("max-width", "4ch")
        }
    }
}
