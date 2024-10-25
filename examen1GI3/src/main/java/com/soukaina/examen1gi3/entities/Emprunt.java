package com.soukaina.examen1gi3.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

import java.util.Date;

@Entity
public class Emprunt {
    @Id
    @GeneratedValue
    private int id;
    @OneToOne
    private User user;
    @OneToOne
    private CD cd;
    private Date dateEmprunt;

    public Emprunt() {}
    public Emprunt(User user, CD cd) {
        this.user = user;
        this.cd = cd;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CD getCd() {
        return cd;
    }

    public void setCd(CD cd) {
        this.cd = cd;
    }

    public Date getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }
}
