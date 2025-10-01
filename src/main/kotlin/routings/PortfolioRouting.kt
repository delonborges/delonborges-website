package com.delonborges.routings

import com.delonborges.services.PortfolioService
import com.delonborges.templates.portfolioPage
import com.delonborges.templates.styles.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.css.CssBuilder

fun Application.configureRouting() {
    routing {
        get("/") {
            val portfolioData = PortfolioService.getPortfolioData()
            call.respondHtml {
                portfolioPage(portfolioData)
            }
        }

        get("/styles/base.css") {
            call.respondText(
                CssBuilder().apply { with(BaseStyle) { apply() } }.toString(), ContentType.Text.CSS
            )
        }

        get("/styles/header.css") {
            call.respondText(
                CssBuilder().apply { with(HeaderStyle) { apply() } }.toString(), ContentType.Text.CSS
            )
        }

        get("/styles/introduction.css") {
            call.respondText(
                CssBuilder().apply { with(IntroductionStyle) { apply() } }.toString(), ContentType.Text.CSS
            )
        }

        get("/styles/experience.css") {
            call.respondText(
                CssBuilder().apply { with(ExperienceStyle) { apply() } }.toString(), ContentType.Text.CSS
            )
        }

        get("/styles/education.css") {
            call.respondText(
                CssBuilder().apply { with(EducationStyle) { apply() } }.toString(), ContentType.Text.CSS
            )
        }

        get("/styles/footer.css") {
            call.respondText(
                CssBuilder().apply { with(FooterStyle) { apply() } }.toString(), ContentType.Text.CSS
            )
        }

        get("/styles/responsive.css") {
            call.respondText(
                CssBuilder().apply { with(ResponsiveStyle) { apply() } }.toString(), ContentType.Text.CSS
            )
        }

        staticResources("/assets", "assets")
    }
}
