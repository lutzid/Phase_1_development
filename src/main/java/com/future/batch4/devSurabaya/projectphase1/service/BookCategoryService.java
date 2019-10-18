package com.future.batch4.devSurabaya.projectphase1.service;

import com.future.batch4.devSurabaya.projectphase1.model.entity.Book;
import com.future.batch4.devSurabaya.projectphase1.model.entity.BookCategory;
import com.future.batch4.devSurabaya.projectphase1.repository.BookCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCategoryService {
    @Autowired
    private BookCategoryRepository bookCategoryRepository;

    public BookCategory findByBookCategoryId(String bookCategoryId){
        return  bookCategoryRepository.findBookCategoryById(bookCategoryId);
    }

    public BookCategory save(BookCategory bookCategory){
        return bookCategoryRepository.save(bookCategory);
    }

    public long deleteBookCategoryById(String bookCategoryId){
        return bookCategoryRepository.deleteBookCategoryById(bookCategoryId);
    }
}
