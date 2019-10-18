package com.future.batch4.devSurabaya.projectphase1.model.entity;

import com.future.batch4.devSurabaya.projectphase1.model.constants.UserConstant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = UserConstant.TABLE_NAME)
public class User extends BaseEntity {
    @Column(name = UserConstant.USERNAME)
    private String username;

    @Column(name = UserConstant.PASSWORD)
    private String password;

    @Column(name = UserConstant.NAME)
    private String name;

    @Column(name = UserConstant.EMAIL)
    private String email;

    @Column(name = UserConstant.PHONE)
    private String phone;

    @Column(name = UserConstant.PHOTO)
    private String photo;

    @Column(name = UserConstant.BIRTHDAY)
    private Date birthday;

    @Column(name = UserConstant.SUPERADMIN)
    private boolean superadmin;

    @Column(name = UserConstant.STATUS)
    private String status;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isSuperadmin() {
        return superadmin;
    }

    public void setSuperadmin(boolean superadmin) {
        this.superadmin = superadmin;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
