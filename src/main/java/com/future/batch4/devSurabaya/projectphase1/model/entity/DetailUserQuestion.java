package com.future.batch4.devSurabaya.projectphase1.model.entity;

import com.future.batch4.devSurabaya.projectphase1.model.constants.DetailUserQuestionConstant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = DetailUserQuestionConstant.TABLE_NAME)
public class DetailUserQuestion extends BaseEntity{
    @Column(name = DetailUserQuestionConstant.CONTENT)
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
