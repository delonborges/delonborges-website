package com.delonborges.routings

import com.delonborges.services.PortfolioService
import com.delonborges.templates.portfolioPage
import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/") {
            val portfolioData = PortfolioService.getPortfolioData()
            call.respondHtml {
                portfolioPage(portfolioData)
            }
        }

        staticResources("/assets", "assets")
    }
}
