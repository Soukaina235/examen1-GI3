package com.soukaina.examen1gi3.service;

import com.soukaina.examen1gi3.dao.CdDao;
import com.soukaina.examen1gi3.dao.EmpruntDao;
import com.soukaina.examen1gi3.entities.CD;
import com.soukaina.examen1gi3.entities.Emprunt;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;

import java.util.List;
import java.util.ResourceBundle;

public class EmpruntService {
    EmpruntDao empruntDao;


    public EmpruntService (CdDao empruntDao){
        this.empruntDao = new EmpruntDao();
    }

    private void addErrorMessage(String message) {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_ERROR, message, null));
    }

    private void addWarningMessage(String message) {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, message, null));
    }

    private void addSuccessMessage(String message) {
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage(FacesMessage.SEVERITY_INFO, message, null));
    }

    public void saveService(Emprunt emprunt) {
        ResourceBundle bundle = ResourceBundle.getBundle("i18n.labels");

        int result = empruntDao.save(emprunt);
        if (result > 0) {
            addSuccessMessage(bundle.getString("cd.save"));
        } else {
            addErrorMessage(bundle.getString("cd.SaveFailed"));
        }
    }

    public List<Emprunt> findAllService(){
        List<Emprunt> emprunts = empruntDao.findAll();
        return emprunts;
    }
}
