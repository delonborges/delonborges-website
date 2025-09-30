package com.delonborges.templates

import com.delonborges.models.*
import kotlinx.html.*

fun HTML.portfolioPage(data: PortfolioData) {
    lang = "en"
    head {
        renderHeadContent(data)
    }
    body {
        renderBodyContent(data)
    }
}

private fun HEAD.renderHeadContent(data: PortfolioData) {
    renderMetaTags()
    renderOpenGraphTags()
    renderTwitterCardTags()

    title(data.personalInfo.name)

    renderLinkTags()
    renderJsonLdScript()
}

private fun BODY.renderBodyContent(data: PortfolioData) {
    a(href = "#main-content", classes = "skip-link") { +"Skip to main content" }
    renderHeader()
    renderIntroduction(data.personalInfo)
    renderExperience(data.experiences)
    renderEducation(data)
    renderFooter(data.personalInfo)
}

private fun HEAD.renderMetaTags() {
    meta(charset = "UTF-8")
    meta(name = "viewport", content = "width=device-width, initial-scale=1")
    meta(name = "description", content = "Delon Borges - Software Engineer specializing in backend development")
    meta(
        name = "keywords", content = "Software Engineer, Backend Developer, Java, Spring Boot, Microservices, Test Automation, Brazil"
    )
    meta(name = "author", content = "Delon Borges")
    meta(name = "robots", content = "index, follow")
}

private fun HEAD.renderOpenGraphTags() {
    meta(name = "property", content = "og:type") { attributes["content"] = "website" }
    meta(name = "property", content = "og:url") { attributes["content"] = "https://delonborges.com/" }
    meta(name = "property", content = "og:title") { attributes["content"] = "Delon Borges - Software Engineer" }
    meta(name = "property", content = "og:description") {
        attributes["content"] = "Delon Borges - Software Engineer specializing in backend development"
    }
    meta(name = "property", content = "og:image") {
        attributes["content"] = "https://delonborges.com/assets/images/profile.png"
    }
}

private fun HEAD.renderTwitterCardTags() {
    meta(name = "property", content = "twitter:card") { attributes["content"] = "summary_large_image" }
    meta(name = "property", content = "twitter:url") { attributes["content"] = "https://delonborges.com/" }
    meta(name = "property", content = "twitter:title") { attributes["content"] = "Delon Borges - Software Engineer" }
    meta(name = "property", content = "twitter:description") {
        attributes["content"] = "Delon Borges - Software Engineer specializing in backend development"
    }
    meta(name = "property", content = "twitter:image") {
        attributes["content"] = "https://delonborges.com/assets/images/profile.png"
    }
}

private fun HEAD.renderLinkTags() {
    link(rel = "stylesheet", href = "/assets/styles/style.css")
    link(rel = "icon", type = "image/svg+xml", href = "/assets/images/logo.svg")
    link(rel = "preconnect", href = "https://fonts.googleapis.com")
    link(rel = "preconnect", href = "https://fonts.gstatic.com") { attributes["crossorigin"] = "" }
    link(
        href = "https://fonts.googleapis.com/css2?family=Fira+Sans:wght@300;400;500;600;700&display=swap", rel = "stylesheet"
    )
}

private fun HEAD.renderJsonLdScript() {
    script(type = "application/ld+json") {
        unsafe {
            raw(
                """
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
            )
        }
    }
}

private fun BODY.renderHeader() {
    header(classes = "header") {
        a(href = "#main-content") {
            attributes["aria-label"] = "Delon Borges - Software Engineer"
            img(alt = "Delon Borges Logo", src = "/assets/images/logo.svg") {
                width = "120"
                height = "40"
            }
        }
        nav {
            attributes["aria-label"] = "Main navigation"
            ul(classes = "header-menu") {
                li { a(href = "#experience") { +"Experience" } }
                li { a(href = "#education") { +"Education" } }
                li { a(href = "#contact") { +"Contact" } }
            }
        }
    }
}

private fun BODY.renderIntroduction(personalInfo: PersonalInfo) {
    main(classes = "introduction") {
        id = "main-content"
        img(alt = "Profile of Delon Borges", src = personalInfo.profileImage) {
            height = "640"
            width = "640"
            attributes["loading"] = "lazy"
        }
        div {
            h1 { +personalInfo.name }
            p {
                +"Located in "
                a(href = personalInfo.locationUrl, target = "_blank") {
                    attributes["rel"] = "noopener noreferrer"
                    attributes["aria-label"] = "View location on Google Maps"
                    +personalInfo.location
                }
            }
        }
    }
}

private fun BODY.renderExperience(experiences: List<Experience>) {
    section(classes = "experience") {
        id = "experience"
        attributes["aria-label"] = "Experience"
        h2(classes = "subtitle") { +"Experience" }
        div {
            p(classes = "experience-text") {
                +"I'm a passionate "
                strong { +"software engineer" }
                +" with expertise in backend development and quality assurance, continuously expanding my "
                strong { +"knowledge" }
                +" and skills in modern software development practices and technologies."
            }
            experiences.forEach { exp ->
                div(classes = "company") {
                    span(classes = "company-year") { +exp.year }
                    h3(classes = "company-title") { +exp.company }
                    span(classes = "company-title") { +exp.position }
                    p(classes = "company-text") { +exp.description }
                    ul(classes = "company-skills") {
                        exp.skills.forEach { skill ->
                            li { +skill }
                        }
                    }
                }
            }
        }
    }
}

private fun BODY.renderEducation(data: PortfolioData) {
    section(classes = "education") {
        id = "education"
        attributes["aria-label"] = "Education"
        div(classes = "education-container") {
            h2(classes = "subtitle") { +"Education" }
            div {
                p(classes = "education-text") {
                    +"Bachelor's Degree in Information Systems from UNISINOS, complemented by continuous learning of modern "
                    strong { +"best practices" }
                    +", advanced "
                    strong { +"techniques" }
                    +" and innovative "
                    strong { +"strategies" }
                    +" in software development."
                }
                ul(classes = "education-list") {
                    li(classes = "education-item") {
                        span(classes = "education-type") { +data.education.type }
                        h3(classes = "education-course") { +data.education.course }
                        span(classes = "education-institute") { +data.education.institute }
                    }
                }
                div(classes = "education-extra") {
                    renderCourses(data.courses)
                    renderProjects(data.projects)
                    renderLanguages(data.languages)
                }
            }
        }
    }
}

private fun DIV.renderCourses(courses: List<Course>) {
    div(classes = "education-extra-courses") {
        h3 { +"Courses" }
        ul {
            courses.forEach { course ->
                li {
                    +course.name
                    span { +course.duration }
                }
            }
        }
    }
}

private fun DIV.renderProjects(projects: List<Project>) {
    div(classes = "education-extra-courses-projects") {
        h3 { +"Course projects" }
        ul {
            projects.forEach { project ->
                li {
                    a(href = project.url, target = "_blank") { +project.url }
                    span { +project.source }
                }
            }
        }
    }
}

private fun DIV.renderLanguages(languages: List<Language>) {
    div(classes = "education-extra-languages") {
        h3 { +"Languages" }
        ul {
            languages.forEach { language ->
                li {
                    +language.name
                    span { +"/ ${language.level}" }
                }
            }
        }
    }
}

private fun BODY.renderFooter(personalInfo: PersonalInfo) {
    footer(classes = "footer") {
        id = "contact"
        div(classes = "footer-container") {
            p(classes = "footer-text") { +"You can reach me at: " }
            ul(classes = "footer-contact") {
                li {
                    a(href = "mailto:${personalInfo.email}") {
                        attributes["rel"] = "noopener noreferrer"
                        attributes["target"] = "_blank"
                        +"email(@)delonborges.com"
                    }
                }
                li {
                    a(href = "https://github.com/delonborges") {
                        attributes["rel"] = "noopener noreferrer"
                        attributes["target"] = "_blank"
                        +"github.com/delonborges"
                    }
                }
                li {
                    a(href = "https://www.linkedin.com/in/delonborges/") {
                        attributes["rel"] = "noopener noreferrer"
                        attributes["target"] = "_blank"
                        +"linkedin.com/in/delonborges"
                    }
                }
            }
            p(classes = "footer-copyright") { +"Delon Borges. Some rights reserved" }
        }
    }
}
