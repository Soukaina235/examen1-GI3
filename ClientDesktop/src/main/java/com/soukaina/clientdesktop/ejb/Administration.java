package com.soukaina.clientdesktop.ejb;

import com.soukaina.clientdesktop.entities.CD;
import com.soukaina.clientdesktop.entities.Emprunt;
import java.util.List;

public interface Administration {
    public boolean ajouterCD(CD cd);
    public boolean modifierCD(CD cd);
    public boolean supprimerCD(CD cd);
    public List<Emprunt> consulterEmprunts();
}
