package com.delonborges.templates.renderers

import kotlinx.html.HEAD
import kotlinx.html.meta

object MetaTagsRenderer {
    private const val SITE_NAME = "Delon Borges - Software Engineer"
    private const val SITE_DESCRIPTION = "Delon Borges - Software Engineer specializing in backend development"
    private const val SITE_URL = "https://delonborges.com/"
    private const val SITE_IMAGE = "https://delonborges.com/assets/images/profile.png"
    private const val SITE_KEYWORDS = "Software Engineer, Backend Developer, Java, Spring Boot, Microservices, Test Automation, Brazil"

    fun render(head: HEAD) {
        head.apply {
            renderBasicMetaTags()
            renderOpenGraphTags()
            renderTwitterCardTags()
        }
    }

    private fun HEAD.renderBasicMetaTags() {
        meta(charset = "UTF-8")
        meta(name = "viewport", content = "width=device-width, initial-scale=1")
        meta(name = "description", content = SITE_DESCRIPTION)
        meta(name = "keywords", content = SITE_KEYWORDS)
        meta(name = "author", content = "Delon Borges")
        meta(name = "robots", content = "index, follow")
    }

    private fun HEAD.renderOpenGraphTags() {
        openGraphMeta("og:type", "website")
        openGraphMeta("og:url", SITE_URL)
        openGraphMeta("og:title", SITE_NAME)
        openGraphMeta("og:description", SITE_DESCRIPTION)
        openGraphMeta("og:image", SITE_IMAGE)
    }

    private fun HEAD.renderTwitterCardTags() {
        openGraphMeta("twitter:card", "summary_large_image")
        openGraphMeta("twitter:url", SITE_URL)
        openGraphMeta("twitter:title", SITE_NAME)
        openGraphMeta("twitter:description", SITE_DESCRIPTION)
        openGraphMeta("twitter:image", SITE_IMAGE)
    }

    private fun HEAD.openGraphMeta(
        property: String,
        content: String
    ) {
        meta(name = "property", content = property) {
            attributes["content"] = content
        }
    }
}
