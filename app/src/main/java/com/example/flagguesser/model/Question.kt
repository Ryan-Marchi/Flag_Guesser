package com.example.flagguesser.model

data class Question(
    val flagImage: Int,
    val correctAnswer: Int,
    val options: List<String>
)
