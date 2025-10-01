package com.delonborges.templates.renderers

import com.delonborges.models.PersonalInfo
import kotlinx.html.*

object IntroductionRenderer {
    fun render(
        body: BODY,
        personalInfo: PersonalInfo
    ) {
        body.main(classes = "introduction") {
            id = "main-content"
            renderProfileImage(personalInfo)
            renderPersonalInfo(personalInfo)
        }
    }

    private fun MAIN.renderProfileImage(personalInfo: PersonalInfo) {
        img(alt = "Profile of Delon Borges", src = personalInfo.profileImage) {
            height = "640"
            width = "640"
            attributes["loading"] = "lazy"
        }
    }

    private fun MAIN.renderPersonalInfo(personalInfo: PersonalInfo) {
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
