package com.future.batch4.devSurabaya.projectphase1.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.future.batch4.devSurabaya.projectphase1.model.constants.BookConstant;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = BookConstant.TABLE_NAME)
public class Book extends BaseEntity {

    @Column(name = BookConstant.TITLE)
    private String title;

    @Column(name = BookConstant.YEAR)
    private Date year;

    @Column(name = BookConstant.PRICE)
    private float price;

    @Column(name = BookConstant.DESCRIPTION)
    private String description;

    @Column(name = BookConstant.PAGE)
    private int page;

    @Column(name = BookConstant.FILE)
    private String file;

    @Column(name = BookConstant.SUMBOUGHT)
    private int sumbought;

    @Column(name = BookConstant.STATUS)
    private String status;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = BookConstant.STORE)
    private Store store;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = BookConstant.WRITER)
    private Writer writer;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public int getSumbought() {
        return sumbought;
    }

    public void setSumbought(int sumbought) {
        this.sumbought = sumbought;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }
}
