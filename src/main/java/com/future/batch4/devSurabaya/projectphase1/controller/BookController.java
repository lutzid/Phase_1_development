package com.future.batch4.devSurabaya.projectphase1.controller;

import com.future.batch4.devSurabaya.projectphase1.model.constants.ApiPath;
import com.future.batch4.devSurabaya.projectphase1.model.entity.Book;
import com.future.batch4.devSurabaya.projectphase1.service.BookService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@Api
@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping(ApiPath.BOOK)
    public Book save(@RequestBody Book book) throws Exception{
        return bookService.save(book);
    }

    @GetMapping(ApiPath.BOOK_BY_ID)
    public Book findBookById(@PathVariable String bookId){
        return bookService.findBookById(bookId);
    }

    @DeleteMapping(ApiPath.BOOK_BY_ID)
    public boolean deleteBookById(@PathVariable String bookId){
        return bookService.deleteBookById(bookId) > 0;
    }
}
