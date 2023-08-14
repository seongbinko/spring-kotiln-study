package com.example.study.blog

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class BlogService(
    val wordRepository: WordRepository
) {
    fun search(blogDto: BlogDto): WordCount? {
        println(blogDto.toString())
        var wordCount: WordCount? = null
        val optional = wordRepository.findById(blogDto.query)
        if (optional.isPresent) {
            wordCount = optional.get()
            wordCount.cnt += 1
        } else {
            wordCount = WordCount(blogDto.query, 0)
            wordRepository.save(wordCount)
        }
        return wordCount
    }
}