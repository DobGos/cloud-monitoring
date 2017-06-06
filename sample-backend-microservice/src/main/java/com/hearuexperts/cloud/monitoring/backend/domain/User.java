package com.hearuexperts.cloud.monitoring.backend.domain;

import java.time.LocalDate;

/**
 * Created by dobs on 26/05/17.
 */
public class User {
    String id;
    String firstname;
    String surname;
    UserStatus userStatus;
    LocalDate created;

    public User() {
    }

    public User(String id, String firstname, String surname, UserStatus userStatus, LocalDate created) {
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.userStatus = userStatus;
        this.created = created;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }
}
