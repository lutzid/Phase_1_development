package com.future.batch4.devSurabaya.projectphase1.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.future.batch4.devSurabaya.projectphase1.model.constants.BookReportConstant;

import javax.persistence.*;

@Entity
@Table(name = BookReportConstant.TABLE_NAME)
public class BookReport extends BaseEntity {

    @Column(name = BookReportConstant.TITLE)
    private String title;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = BookReportConstant.BOOK)
    private Book book;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = BookReportConstant.USER)
    private User user;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
