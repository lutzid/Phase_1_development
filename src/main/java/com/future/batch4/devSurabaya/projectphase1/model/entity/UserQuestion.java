package com.future.batch4.devSurabaya.projectphase1.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.future.batch4.devSurabaya.projectphase1.model.constants.UserQuestionConstant;

import javax.persistence.*;

@Entity
@Table(name = UserQuestionConstant.TABLE_NAME)
public class UserQuestion extends BaseEntity {
    @Column(name = UserQuestionConstant.ANSWER)
    private String answer;

    @Column(name = UserQuestionConstant.CLUE)
    private String clue;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = UserQuestionConstant.USER)
    private User user;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = UserQuestionConstant.DETAILUSERQUESTION)
    private DetailUserQuestion detailUserQuestion;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getClue() {
        return clue;
    }

    public void setClue(String clue) {
        this.clue = clue;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public DetailUserQuestion getDetailUserQuestion() {
        return detailUserQuestion;
    }

    public void setDetailUserQuestion(DetailUserQuestion detailUserQuestion) {
        this.detailUserQuestion = detailUserQuestion;
    }
}
