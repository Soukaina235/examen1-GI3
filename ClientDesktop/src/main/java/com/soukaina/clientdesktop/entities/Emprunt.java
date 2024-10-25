package com.soukaina.clientdesktop.entities;

import java.util.Date;

public class Emprunt {
    private int id;
    private User user;
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
