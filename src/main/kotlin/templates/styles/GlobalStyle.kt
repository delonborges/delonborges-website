package com.delonborges.templates.styles

import kotlinx.html.HEAD

object GlobalStyle {
    fun render(head: HEAD) {
        BaseStyle.render(head)
        HeaderStyle.render(head)
        IntroductionStyle.render(head)
        ExperienceStyle.render(head)
        EducationStyle.render(head)
        FooterStyle.render(head)
        ResponsiveStyle.render(head)
    }
}
