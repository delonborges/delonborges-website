package com.delonborges.models

data class Experience(
    val year: String,
    val company: String,
    val position: String,
    val description: String,
    val skills: List<String>
)
