package com.soukaina.examen1gi3.ejbs;

import com.soukaina.examen1gi3.entities.CD;
import com.soukaina.examen1gi3.entities.Emprunt;
import jakarta.ejb.Remote;
import jakarta.ejb.Stateful;

import java.util.List;

@Stateful
@Remote
public interface Administration {
    public boolean ajouterCD(CD cd);
    public boolean modifierCD(CD cd);
    public boolean supprimerCD(CD cd);
    public List<Emprunt> consulterEmprunts();
}
