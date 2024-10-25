package com.example.article_backend.ArticleClass;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    // Get all article titles
    @GetMapping("/titles")
    public List<Article> getAllArticleTitles() {
        return articleService.getAllArticles();
    }

    @PutMapping("/{id}/increment-read-count")
    public ResponseEntity<String> incrementReadCount(@PathVariable Long id) {
        articleService.incrementReadCount(id);
        return ResponseEntity.ok("Read count incremented.");
    }

    @GetMapping("/{id}/read-count")
    public ResponseEntity<Integer> getReadCount(@PathVariable Long id) {
        int readCount = articleService.getReadCount(id);
        return ResponseEntity.ok(readCount);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Article> getArticleById(@PathVariable Long id) {
        return articleService.getArticleById(id)
                .map(article -> ResponseEntity.ok(article))
                .orElse(ResponseEntity.notFound().build());
    }


}
