package com.delonborges.models

data class PortfolioData(
    val personalInfo: PersonalInfo,
    val experiences: List<Experience>,
    val education: Education,
    val courses: List<Course>,
    val projects: List<Project>,
    val languages: List<Language>
)
