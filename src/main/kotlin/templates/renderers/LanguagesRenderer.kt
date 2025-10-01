package com.delonborges.templates.renderers

import com.delonborges.models.Language
import kotlinx.html.*

object LanguagesRenderer {
    fun render(
        div: DIV,
        languages: List<Language>
    ) {
        div.div(classes = "education-extra-languages") {
            h3 { +"Languages" }
            ul {
                languages.forEach { language ->
                    li {
                        +language.name
                        span { +" / ${language.level}" }
                    }
                }
            }
        }
    }
}
