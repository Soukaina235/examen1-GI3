package com.soukaina.examen1gi3.ejbs;

import com.soukaina.examen1gi3.entities.CD;
import com.soukaina.examen1gi3.entities.Emprunt;
import jakarta.ejb.Remote;
import jakarta.ejb.Stateless;

import java.util.List;

@Stateless
@Remote
public interface User {
    public boolean emprunter(CD cd);
    public boolean retourner(CD cd);
    public List<Emprunt> consulterEmprunts();
}
