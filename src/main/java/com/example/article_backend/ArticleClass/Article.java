package com.example.article_backend.ArticleClass;


import java.time.LocalDate;
import java.time.LocalDateTime;


public class Article {


    private Long id;
    private String title;
    private String content;
    private int readCount; // New field for read count
    private LocalDate publishDate;

    // Constructor
    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.readCount = 0; // Initialize read count to 0
        this.publishDate = LocalDate.now();
    }

    public Article() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getReadCount() {
        return readCount;
    }

    public void incrementReadCount() {
        this.readCount++; // Increment the read count by 1
    }

    public LocalDate getPublishDate() { return publishDate; }

    public void setPublishDate(LocalDate publishDate) {
        this.publishDate = publishDate;
    }

    public void setReadCount(int readCount) {
        this.readCount = readCount;
    }
}
