package com.future.batch4.devSurabaya.projectphase1.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.future.batch4.devSurabaya.projectphase1.model.constants.TransactionConstant;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = TransactionConstant.TABLE_NAME)
public class Transaction extends BaseEntity {

    @Column(name = TransactionConstant.DATE)
    private Date date;

    @Column(name = TransactionConstant.STATUS)
    private String status;

    @Column(name = TransactionConstant.TOTALPRICE)
    private float totalprice;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = TransactionConstant.USER)
    private User user;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(float totalprice) {
        this.totalprice = totalprice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
