package com.delonborges.templates.sections

import kotlinx.html.HEAD
import kotlinx.html.script
import kotlinx.html.unsafe

object StructuredDataRenderer {
    fun render(head: HEAD) {
        head.script(type = "application/ld+json") {
            unsafe {
                raw(buildJsonLdSchema())
            }
        }
    }

    private fun buildJsonLdSchema(): String {
        return """
            {
                "@context": "https://schema.org",
                "@type": "Person",
                "name": "Delon Borges",
                "jobTitle": "Software Engineer",
                "description": "Delon Borges - Software Engineer specializing in backend development",
                "url": "https://delonborges.com",
                "image": "https://delonborges.com/assets/images/profile.png",
                "email": "email@delonborges.com",
                "address": {
                    "@type": "PostalAddress",
                    "addressCountry": "Brazil"
                },
                "sameAs": [
                    "https://github.com/delonborges",
                    "https://www.linkedin.com/in/delonborges/"
                ],
                "knowsAbout": [
                    "Java",
                    "Spring Boot",
                    "Microservices",
                    "Test Automation",
                    "Backend Development",
                    "SQL",
                    "JUnit",
                    "Selenium",
                    "RestAssured",
                    "CI/CD"
                ],
                "worksFor": {
                    "@type": "Organization",
                    "name": "Sicredi"
                }
            }
        """.trimIndent()
    }
}
