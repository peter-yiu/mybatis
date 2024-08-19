package com.alicorn.backend.service;


import com.alicorn.backend.entity.Book;
import com.alicorn.backend.mapper.BookMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private final BookMapper bookMapper;

    public BookService(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public List<Book> findAll() {
        return bookMapper.findAll();
    }

    public Book findById(int id) {
        return bookMapper.findById(id);
    }

    public void save(Book book) {
        if (book.getId() == null) {
            bookMapper.insert(book);
        } else {
            bookMapper.update(book);
        }
    }

    public void delete(int id) {
        bookMapper.delete(id);
    }
}