package com.example.study.blog

data class ErrorResponse (

    val message: String,
    val errorType: String = "Invalid Argument"
)