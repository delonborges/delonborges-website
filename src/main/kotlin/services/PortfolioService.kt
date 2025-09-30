package com.delonborges.services

import com.delonborges.models.*

object PortfolioService {
    fun getPortfolioData(): PortfolioData {
        return PortfolioData(
            personalInfo = getPersonalInfo(),
            experiences = getExperiences(),
            education = getEducation(),
            courses = getCourses(),
            projects = getProjects(),
            languages = getLanguages()
        )
    }

    private fun getPersonalInfo() = PersonalInfo(
        name = "Delon Borges - Software Engineer",
        title = "Software Engineer",
        location = "Brazil",
        locationUrl = "https://maps.app.goo.gl/2W3ZaqYLcEg4NKWJ9",
        email = "email@delonborges.com",
        profileImage = "/assets/images/profile.png"
    )

    private fun getExperiences() = listOf(
        Experience(
            year = "2021 - Present",
            company = "Sicredi",
            position = "Software Engineer",
            description = "Developing and maintaining backend systems using Java and Spring framework. Working with microservices architecture, implementing CI/CD pipelines, and ensuring code quality through comprehensive testing practices. Collaborating with cross-functional teams to deliver scalable and reliable software solutions.",
            skills = listOf(
                "java", "sql", "spring", "junit", "api", "microservices", "ci/cd"
            )
        ), Experience(
            year = "2021 - 2024",
            company = "Sicredi",
            position = "Software Quality Engineer",
            description = "Designed and implemented comprehensive test automation frameworks for web applications and APIs. Created automated test suites using Selenium, JUnit, and RestAssured to ensure software quality and reliability. Collaborated with development teams to establish testing best practices and continuous integration processes.",
            skills = listOf(
                "java", "sql", "selenium", "junit", "restassured", "api"
            )
        ), Experience(
            year = "2021 - 2021",
            company = "Zup",
            position = "Automation Test Analyst",
            description = "Developed automated testing solutions using multiple technologies including Selenium, Playwright, and Protractor for web applications. Implemented API testing frameworks with RestAssured and created JavaScript-based test suites using Jest. Focused on improving test coverage and reducing manual testing efforts through comprehensive automation strategies.",
            skills = listOf(
                "java", "sql", "javascript", "selenium", "junit", "jest", "restassured", "playwright", "protractor", "api"
            )
        ), Experience(
            year = "2020 - 2021",
            company = "GVDASA",
            position = "Test Analyst",
            description = "Performed manual and automated testing using C# and NUnit framework for desktop and web applications. Developed API testing solutions with RestAssured and implemented Selenium-based automation scripts. Contributed to quality assurance processes and helped establish testing methodologies within the development lifecycle.",
            skills = listOf(
                "c#", "nunit", "restassured", "selenium", "api"
            )
        )
    )

    private fun getEducation() = Education(
        type = "Bachelor's Degree", course = "Information Systems", institute = "UNISINOS"
    )

    private fun getCourses() = listOf(
        Course(
            "Spring Boot Bootcamp at DevSuperior", "160h"
        ), Course(
            "Microservices Formation at Decoder", "320h"
        )
    )

    private fun getProjects() = listOf(
        Project(
            "dsmovie.delonborges.com", "https://dsmovie.delonborges.com", "DevSuperior"
        )
    )

    private fun getLanguages() = listOf(
        Language(
            "Portuguese", "First Language"
        ), Language(
            "English", "Upper Intermediate"
        )
    )
}
