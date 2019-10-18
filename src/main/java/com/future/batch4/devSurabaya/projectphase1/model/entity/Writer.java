package com.future.batch4.devSurabaya.projectphase1.model.entity;

import com.future.batch4.devSurabaya.projectphase1.model.constants.WriterConstant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = WriterConstant.TABLE_NAME)
public class Writer extends BaseEntity {

    @Column(name = WriterConstant.NAME)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
