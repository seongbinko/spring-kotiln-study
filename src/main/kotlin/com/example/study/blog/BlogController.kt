package com.example.study.blog

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import io.swagger.v3.oas.annotations.info.Info
import jakarta.validation.Valid
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@OpenAPIDefinition(
    info = Info(title = "Couple App",
        description = "couple app api명세",
        version = "v1"))
@RestController
class BlogController(
    val blogService: BlogService
) {
    @PostMapping(value = arrayOf("/api/blogs"))
    fun search(@RequestBody @Valid blogDto: BlogDto): WordCount? {
        val result = blogService.search(blogDto)
        return result
    }
}