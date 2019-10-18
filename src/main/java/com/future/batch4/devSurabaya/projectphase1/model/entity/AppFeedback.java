package com.future.batch4.devSurabaya.projectphase1.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.future.batch4.devSurabaya.projectphase1.model.constants.AppFeedbackConstant;

import javax.persistence.*;

@Entity
@Table(name = AppFeedbackConstant.TABLE_NAME)
public class AppFeedback extends BaseEntity {

    @Column(name = AppFeedbackConstant.TITLE)
    private String title;

    @Column(name = AppFeedbackConstant.CONTENT)
    private String content;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = AppFeedbackConstant.USER)
    private User user;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
