package com.soukaina.examen1gi3.service;

import com.soukaina.examen1gi3.dao.CdDao;
import com.soukaina.examen1gi3.entities.CD;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;

import java.util.List;
import java.util.Objects;
import java.util.ResourceBundle;

public class CdService {
    CdDao cdDao;


    public CdService(CdDao cdDao){
        this.cdDao = new CdDao();
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

    public void saveService(CD cd) {
        ResourceBundle bundle = ResourceBundle.getBundle("i18n.labels");

        int result = cdDao.save(cd);
        if (result > 0) {
            addSuccessMessage(bundle.getString("cd.save"));
        } else {
            addErrorMessage(bundle.getString("cd.SaveFailed"));
        }
    }

    public void editService(CD cd) {
        ResourceBundle bundle = ResourceBundle.getBundle("i18n.labels");

        boolean result = cdDao.edit(cd);
        if (result) {
            addSuccessMessage(bundle.getString("cd.edit"));
        } else {
            addErrorMessage(bundle.getString("cd.edit.failed"));
        }
    }

    public List<CD> findAllService(){
        List<CD> cds = cdDao.findAll();
        return cds;
    }

    public void deleteService(CD cd) {
        boolean result = cdDao.delete(cd);
        ResourceBundle bundle = ResourceBundle.getBundle("i18n.labels");

        if (result) {
            addSuccessMessage(bundle.getString("cd.delete"));
        } else {
            addErrorMessage(bundle.getString("cd.delete.failed"));
        }
    }
}
