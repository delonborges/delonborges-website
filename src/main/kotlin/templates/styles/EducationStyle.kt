package com.delonborges.templates.styles

import kotlinx.css.*
import kotlinx.css.properties.LineHeight

object EducationStyle {
    fun CssBuilder.apply() {
        rule(".education") {
            backgroundColor = Color("#141414")
            color = Color("#e0e0e0")
        }

        rule(".education-container") {
            maxWidth = 1200.px
            padding = Padding(120.px, 20.px)
            margin = Margin(0.px, LinearDimension.auto)
            display = Display.grid
            put("grid-template-columns", "1fr 2fr")
            put("gap", "100px")
            position = Position.relative
        }

        rule(".education-container::after") {
            put("content", "\"\"")
            display = Display.block
            width = 130.px
            height = 100.px
            put("background", "url(\"/assets/images/lines.svg\") no-repeat center")
            position = Position.absolute
            bottom = (-50).px
            left = 20.px
        }

        rule(".education .subtitle") {
            color = Color("#000000")
            put("max-width", "5ch")
        }

        rule(".education-text") {
            fontSize = 1.5.rem
            lineHeight = LineHeight("1.33")
            put("max-width", "50ch")
            marginBottom = 60.px
            color = Color("#a3a3a3")
        }

        rule(".education-text strong") {
            color = Color("#ffffff")
        }

        rule(".education-list") {
            display = Display.flex
            flexWrap = FlexWrap.wrap
            put("gap", "20px")
            marginBottom = 60.px
        }

        rule(".education-item") {
            put("flex", "1")
            backgroundColor = Color("#000000")
            padding = Padding(20.px)
            borderRadius = 4.px
            display = Display.flex
            flexDirection = FlexDirection.column
        }

        rule(".education-type") {
            fontSize = 0.875.rem
            textTransform = TextTransform.uppercase
            color = Color("#a3a3a3")
            marginBottom = 10.px
        }

        rule(".education-course") {
            put("flex", "1")
            fontSize = 1.125.rem
            lineHeight = LineHeight("1.4")
            marginBottom = 40.px
            position = Position.relative
        }

        rule(".education-course::before") {
            put("content", "''")
            display = Display.block
            width = 4.px
            height = 20.px
            put("background", "linear-gradient(#f24f00, #d13100)")
            position = Position.absolute
            left = (-24).px
        }

        rule(".education-institute") {
            fontSize = 1.125.rem
            color = Color("#a3a3a3")
        }

        rule(".education-extra-courses, .education-extra-courses-projects") {
            marginBottom = 60.px
        }

        rule(".education-extra-courses-projects a") {
            color = Color("#ffffff")
        }

        rule(".education-extra h3") {
            fontSize = 0.875.rem
            lineHeight = LineHeight("1.4")
            textTransform = TextTransform.uppercase
            color = Color("#8f8f8f")
            marginBottom = 30.px
        }

        rule(".education-extra li") {
            fontSize = 1.125.rem
            lineHeight = LineHeight("1.1")
            marginBottom = 20.px
        }

        rule(".education-extra span") {
            color = Color("#8f8f8f")
        }

        rule(".languages") {
            display = Display.flex
            flexWrap = FlexWrap.wrap
            put("gap", "10px")
            put("align-content", "start")
        }

        rule(".languages li") {
            fontSize = 0.875.rem
            lineHeight = LineHeight("1.4")
            borderRadius = 4.px
            backgroundColor = Color("#ffffff")
            padding = Padding(5.px, 10.px)
            color = Color("#141414")
        }
    }
}
