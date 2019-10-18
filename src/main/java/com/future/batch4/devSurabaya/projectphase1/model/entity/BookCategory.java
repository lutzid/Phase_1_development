package com.future.batch4.devSurabaya.projectphase1.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.future.batch4.devSurabaya.projectphase1.model.constants.BookCategoryConstant;

import javax.persistence.*;

@Entity
@Table(name = BookCategoryConstant.TABLE_NAME)
public class BookCategory extends BaseEntity {
    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = BookCategoryConstant.BOOK)
    private Book book;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = BookCategoryConstant.DETAILBOOKCATEGORY)
    private DetailBookCategory detailBookCategory;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public DetailBookCategory getDetailBookCategory() {
        return detailBookCategory;
    }

    public void setDetailBookCategory(DetailBookCategory detailBookCategory) {
        this.detailBookCategory = detailBookCategory;
    }
}
