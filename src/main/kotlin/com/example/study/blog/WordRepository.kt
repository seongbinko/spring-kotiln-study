package com.example.study.blog

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.CrudRepository

interface WordRepository : CrudRepository<WordCount, String> {
}