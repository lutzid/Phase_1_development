package com.future.batch4.devSurabaya.projectphase1.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.future.batch4.devSurabaya.projectphase1.model.constants.ReviewConstant;

import javax.persistence.*;

@Entity
@Table(name = ReviewConstant.TABLE_NAME)
public class Review extends BaseEntity {
    @Column(name = ReviewConstant.CONTENT)
    private String content;

    @Column(name = ReviewConstant.STAR)
    private int star;

    @Column(name = ReviewConstant.TOTALHELP)
    private int totalhelp;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = ReviewConstant.BOOK)
    private Book book;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = ReviewConstant.USER)
    private User user;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getTotalhelp() {
        return totalhelp;
    }

    public void setTotalhelp(int totalhelp) {
        this.totalhelp = totalhelp;
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
