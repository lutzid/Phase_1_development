package com.future.batch4.devSurabaya.projectphase1.service;

import com.future.batch4.devSurabaya.projectphase1.model.entity.Book;
import com.future.batch4.devSurabaya.projectphase1.model.entity.BookReport;
import com.future.batch4.devSurabaya.projectphase1.repository.BookReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookReportService {
    @Autowired
    private BookReportRepository bookReportRepository;

    public BookReport findByBookId(String bookId){
        return bookReportRepository.findByBookId(bookId);
    }

    public BookReport save(BookReport bookReport){
        return bookReportRepository.save(bookReport);
    }

    public long deleteByBookReportId(String bookreportId){
        return bookReportRepository.deleteByBookReportId(bookreportId);
    }

    public List<BookReport> findAll(){
        return bookReportRepository.findAll();
    }

    /*public BookReport findOne(String id){
        return bookReportRepository.findById(id);
    }*/
}
