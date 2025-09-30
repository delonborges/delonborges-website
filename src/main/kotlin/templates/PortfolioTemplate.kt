package com.delonborges.templates

import com.delonborges.models.PortfolioData
import com.delonborges.templates.sections.*
import kotlinx.html.*

fun HTML.portfolioPage(data: PortfolioData) {
    lang = "en"
    head {
        renderHead(data)
    }
    body {
        renderBody(data)
    }
}

private fun HEAD.renderHead(data: PortfolioData) {
    MetaTagsRenderer.render(this)
    title(data.personalInfo.name)
    ResourceLinksRenderer.render(this)
    StructuredDataRenderer.render(this)
}

private fun BODY.renderBody(data: PortfolioData) {
    SkipLinkRenderer.render(this)
    HeaderRenderer.render(this)
    IntroductionRenderer.render(this, data.personalInfo)
    ExperienceRenderer.render(this, data.experiences)
    EducationRenderer.render(this, data)
    FooterRenderer.render(this, data.personalInfo)
}
