package com.delonborges.templates.styles

import kotlinx.css.*

object ResponsiveStyle {
    fun CssBuilder.apply() {
        media("(max-width: 800px)") {
            rule(".introduction, .experience, .education-container, .footer-container") {
                put("grid-template-columns", "1fr")
                put("gap", "60px")
            }

            rule(".introduction") {
                textAlign = TextAlign.center
            }

            rule(".subtitle") {
                fontSize = 3.rem
            }

            rule(".header") {
                flexDirection = FlexDirection.column
                put("gap", "40px")
                textAlign = TextAlign.center
            }

            rule(".company-year") {
                position = Position.initial
                textAlign = TextAlign.left
                width = LinearDimension.auto
                marginBottom = 10.px
            }
        }
    }
}
