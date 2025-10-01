package com.delonborges.templates.styles

import kotlinx.css.*
import kotlinx.css.properties.LineHeight
import kotlinx.css.properties.TextDecoration

object IntroductionStyle {
    fun CssBuilder.apply() {
        rule(".introduction") {
            maxWidth = 1200.px
            padding = Padding(40.px, 20.px)
            margin = Margin(0.px, LinearDimension.auto)
            display = Display.grid
            put("grid-template-columns", "1fr 2fr")
            put("gap", "100px")
            alignItems = Align.center
        }

        rule(".introduction h1") {
            fontSize = 4.5.rem
            lineHeight = LineHeight("1.125")
            marginBottom = 30.px
            position = Position.relative
        }

        rule(".introduction h1::before") {
            put("content", "\"\"")
            display = Display.block
            width = 130.px
            height = 100.px
            put("background", "url('/assets/images/lines.svg') no-repeat center")
            position = Position.absolute
            top = (-15).px
            left = (-40).px
            zIndex = -1
        }

        rule(".introduction p") {
            fontSize = 1.5.rem
            color = Color("#525252")
        }

        rule(".introduction p a") {
            textDecoration = TextDecoration.none
            color = Color("#141414")
        }
    }
}
