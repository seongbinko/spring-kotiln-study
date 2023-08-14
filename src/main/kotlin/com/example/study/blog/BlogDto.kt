package com.example.study.blog

import jakarta.validation.constraints.NotBlank

data class BlogDto(

    @field:NotBlank(message = "query parameter required!!!!")
    val query: String
)