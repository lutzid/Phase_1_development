package com.future.batch4.devSurabaya.projectphase1.model.entity;

import com.future.batch4.devSurabaya.projectphase1.model.constants.DetailBookCategoryConstant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = DetailBookCategoryConstant.TABLE_NAME)
public class DetailBookCategory extends BaseEntity{
    @Column(name = DetailBookCategoryConstant.NAME)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
