package com.delonborges.templates.styles

import kotlinx.css.*
import kotlinx.css.properties.LineHeight
import kotlinx.css.properties.TextDecoration

object HeaderStyle {
    fun CssBuilder.apply() {
        rule(".header") {
            maxWidth = 1200.px
            padding = Padding(40.px, 20.px)
            margin = Margin(0.px, LinearDimension.auto)
            display = Display.flex
            justifyContent = JustifyContent.spaceBetween
            alignItems = Align.center
        }

        rule(".header-menu") {
            display = Display.flex
            flexWrap = FlexWrap.wrap
            put("gap", "10px")
            justifyContent = JustifyContent.center
        }

        rule(".header-menu a") {
            fontSize = 1.125.rem
            lineHeight = LineHeight("1.3")
            padding = Padding(10.px, 20.px)
            textDecoration = TextDecoration.none
            color = Color("#141414")
            display = Display.block
        }
    }
}
