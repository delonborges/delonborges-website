package com.delonborges.templates.styles

import kotlinx.css.*
import kotlinx.css.properties.LineHeight

object ExperienceStyle {
    fun CssBuilder.apply() {
        rule(".experience") {
            maxWidth = 1200.px
            padding = Padding(40.px, 20.px)
            margin = Margin(0.px, LinearDimension.auto)
            display = Display.grid
            put("grid-template-columns", "1fr 2fr")
            put("gap", "100px")
        }

        rule(".experience .subtitle") {
            color = Color("#e0e0e0")
        }

        rule(".experience-text") {
            fontSize = 1.5.rem
            lineHeight = LineHeight("1.33")
            put("max-width", "50ch")
            marginBottom = 60.px
            color = Color("#525252")
        }

        rule(".experience-text strong") {
            color = Color("#141414")
        }

        rule(".company") {
            display = Display.grid
            put("grid-template-columns", "1fr 1fr")
            put("gap", "10px 20px")
            padding = Padding(20.px)
            backgroundColor = Color("#f5f5f5")
            marginBottom = 20.px
            borderRadius = 4.px
            position = Position.relative
        }

        rule(".company::before") {
            put("content", "''")
            display = Display.block
            width = 4.px
            height = 20.px
            put("background", "linear-gradient(#f24f00, #d13100)")
            position = Position.absolute
            top = 20.px
            left = (-4).px
        }

        rule(".company-year") {
            position = Position.absolute
            top = 22.px
            left = (-120).px
            textAlign = TextAlign.right
            width = 100.px
            color = Color("#525252")
            fontSize = 0.875.rem
        }

        rule(".company-title") {
            fontSize = 1.125.rem
            lineHeight = LineHeight("1.1")
            fontWeight = FontWeight.bold
        }

        rule(".company-text") {
            fontSize = 0.875.rem
            lineHeight = LineHeight("1.4")
            color = Color("#525252")
        }

        rule(".company-skills") {
            display = Display.flex
            flexWrap = FlexWrap.wrap
            put("gap", "10px")
            put("align-content", "start")
        }

        rule(".company-skills li") {
            fontSize = 0.875.rem
            lineHeight = LineHeight("1.4")
            borderRadius = 4.px
            backgroundColor = Color("#ffffff")
            padding = Padding(2.px, 5.px)
        }
    }
}
