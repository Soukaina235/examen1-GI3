package com.soukaina.examen1gi3.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class CD {
    @Id
    @GeneratedValue
    private int cdId;
    private String cdName;
    private boolean disponible;

    public CD() {}
    public CD(int cdId, String cdName, boolean disponible) {
        this.cdId = cdId;
        this.cdName = cdName;
        this.disponible = disponible;
    }

    public int getCd_id() {
        return cdId;
    }

    public void setCd_id(int cdId) {
        this.cdId = cdId;
    }

    public String getCd_name() {
        return cdName;
    }

    public void setCd_name(String cdName) {
        this.cdName = cdName;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
