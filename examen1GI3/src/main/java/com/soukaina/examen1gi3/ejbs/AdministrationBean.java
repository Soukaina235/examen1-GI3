package com.soukaina.examen1gi3.ejbs;

import com.soukaina.examen1gi3.entities.CD;
import com.soukaina.examen1gi3.entities.Emprunt;
import jakarta.ejb.Remote;
import jakarta.ejb.Stateful;

import java.util.List;

@Stateful
@Remote(Administration.class)
public class AdministrationBean implements Administration {

    @Override
    public boolean ajouterCD(CD cd) {
        return false;
    }

    @Override
    public boolean modifierCD(CD cd) {
        return false;
    }

    @Override
    public boolean supprimerCD(CD cd) {
        return false;
    }

    @Override
    public List<Emprunt> consulterEmprunts() {
        return List.of();
    }
}
