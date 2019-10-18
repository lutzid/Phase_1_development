package com.future.batch4.devSurabaya.projectphase1.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.future.batch4.devSurabaya.projectphase1.model.constants.BookConstant;
import com.future.batch4.devSurabaya.projectphase1.model.constants.StoreConstant;

import javax.persistence.*;

@Entity
@Table(name = StoreConstant.TABLE_NAME)
public class Store extends BaseEntity {

    @Column(name = StoreConstant.NAME)
    private String name;

    @Column(name = StoreConstant.DESCRIPTION)
    private String description;

    @Column(name = StoreConstant.PHOTO)
    private String photo;

    @Column(name = StoreConstant.INCOME)
    private float income;

    @Column(name = StoreConstant.SOLDBOOK)
    private float soldbook;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = StoreConstant.USER)
    private User user;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public float getIncome() {
        return income;
    }

    public void setIncome(float income) {
        this.income = income;
    }

    public float getSoldbook() {
        return soldbook;
    }

    public void setSoldbook(float soldbook) {
        this.soldbook = soldbook;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
