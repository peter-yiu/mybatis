package com.fyber.backend.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class Book {

    private Integer id;

    private String title;

    private String author;

    private String isbn;

    private LocalDate publicationDate;

    private String genre;


    private String description;

    private String filePath;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}