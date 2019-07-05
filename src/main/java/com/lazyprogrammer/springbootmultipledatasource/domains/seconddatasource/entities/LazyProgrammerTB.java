package com.lazyprogrammer.springbootmultipledatasource.domains.seconddatasource.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class LazyProgrammerTB {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    @NotNull
    private String username;
    @Column
    @NotNull
    private String email;
    @Column
    @NotNull
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
