package com.future.batch4.devSurabaya.projectphase1.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.future.batch4.devSurabaya.projectphase1.model.constants.LikeConstant;

import javax.persistence.*;

@Entity
@Table(name = LikeConstant.TABLE_NAME)
public class Like extends BaseEntity {
    @Column(name = LikeConstant.HELP)
    private int help;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = LikeConstant.USER)
    private User user;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = LikeConstant.REVIEW)
    private Review review;

    public int getHelp() {
        return help;
    }

    public void setHelp(int help) {
        this.help = help;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }
}
