package com.delonborges.model

data class PersonalInfo(
    val name: String,
    val title: String,
    val location: String,
    val locationUrl: String,
    val email: String,
    val profileImage: String
)

data class Experience(
    val year: String,
    val company: String,
    val position: String,
    val description: String,
    val skills: List<String>
)

data class Education(
    val type: String,
    val course: String,
    val institute: String
)

data class Course(
    val name: String,
    val duration: String
)

data class Project(
    val name: String,
    val url: String,
    val source: String
)

data class Language(
    val name: String,
    val level: String
)

data class PortfolioData(
    val personalInfo: PersonalInfo,
    val experiences: List<Experience>,
    val education: Education,
    val courses: List<Course>,
    val projects: List<Project>,
    val languages: List<Language>
)
