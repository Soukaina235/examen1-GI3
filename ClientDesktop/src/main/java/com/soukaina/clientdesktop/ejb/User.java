package com.soukaina.clientdesktop.ejb;

import com.soukaina.clientdesktop.entities.CD;
import com.soukaina.clientdesktop.entities.Emprunt;

import java.util.List;

public interface User {
    public boolean emprunter(CD cd);
    public boolean retourner(CD cd);
    public List<Emprunt> consulterEmprunts();
}

