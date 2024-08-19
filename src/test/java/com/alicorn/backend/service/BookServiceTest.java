package com.alicorn.backend.service;

import com.alicorn.backend.entity.Book;
import com.alicorn.backend.mapper.BookMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class BookServiceTest {


    @Mock
    private BookMapper bookMapper;

    @InjectMocks
    private BookService bookService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void findAll() {
        Book book = new Book();
        book.setId(1);
        book.setTitle("Test Book");
        when(bookMapper.findAll()).thenReturn(Arrays.asList(book));

        List<Book> books = bookService.findAll();
        assertEquals(1, books.size());
        assertEquals("Test Book", books.get(0).getTitle());
    }

    @Test
    void findById() {
        Book book = new Book();
        book.setId(1);
        book.setTitle("Test Book");
        when(bookMapper.findById(1)).thenReturn(book);

        Book foundBook = bookService.findById(1);
        assertEquals(1, foundBook.getId());
        assertEquals("Test Book", foundBook.getTitle());
    }

    @Test
    void saveNewBook() {
        Book book = new Book();
        book.setTitle("Test Book");

        bookService.save(book);
        verify(bookMapper, times(1)).insert(book);
    }

    @Test
    void updateBook() {
        Book book = new Book();
        book.setId(1);
        book.setTitle("Updated Book");

        bookService.save(book);
        verify(bookMapper, times(1)).update(book);
    }

    @Test
    void delete() {
        bookService.delete(1);
        verify(bookMapper, times(1)).delete(1);
    }
}