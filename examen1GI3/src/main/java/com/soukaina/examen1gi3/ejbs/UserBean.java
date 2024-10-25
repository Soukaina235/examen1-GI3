package com.soukaina.examen1gi3.ejbs;

import com.soukaina.examen1gi3.entities.CD;
import com.soukaina.examen1gi3.entities.Emprunt;
import jakarta.ejb.Remote;
import jakarta.ejb.Stateless;

import java.util.List;

@Stateless
@Remote(User.class)
public class UserBean implements User{
    @Override
    public boolean emprunter(CD cd) {
        return false;
    }

    @Override
    public boolean retourner(CD cd) {
        return false;
    }

    @Override
    public List<Emprunt> consulterEmprunts() {
        return List.of();
    }
}
