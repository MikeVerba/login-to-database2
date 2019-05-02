package com.example.logintodatabase.models.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "contact")
@Data
public class ContactEntity {
    public @Id @GeneratedValue int id;
    private String name;
    private String surname;
    private String phone;
    private String email;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserEntity user; //

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
