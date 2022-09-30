package com.example.demo.Service;

import com.example.demo.Bean.Book;

import java.util.List;

public interface BookService {
    public int addBook (Book book);

    public int updateBook (Book book);

    public int deleteBookById(Integer id);

    public Book getBookById(Integer id);

    public List<Book> getAllBooks();

}
