package com.future.batch4.devSurabaya.projectphase1.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.future.batch4.devSurabaya.projectphase1.model.constants.StoreReportConstant;

import javax.persistence.*;

@Entity
@Table(name = StoreReportConstant.TABLE_NAME)
public class StoreReport extends BaseEntity {

    @Column(name = StoreReportConstant.TITLE)
    private String title;

    @Column(name = StoreReportConstant.CONTENT)
    private String content;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = StoreReportConstant.STORE)
    private Store store;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = StoreReportConstant.USER)
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

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
