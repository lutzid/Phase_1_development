package com.future.batch4.devSurabaya.projectphase1.service;

import com.future.batch4.devSurabaya.projectphase1.model.entity.Book;
import com.future.batch4.devSurabaya.projectphase1.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    public Book findBookById(String bookId){
        return bookRepository.findBookById(bookId);
    }

    public Book save(Book book){
        return bookRepository.save(book);
    }

    public long deleteBookById(String bookId){
        return bookRepository.deleteBookById(bookId);
    }
}
