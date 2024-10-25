package com.soukaina.examen1gi3.dao;

import com.soukaina.examen1gi3.entities.CD;
import com.soukaina.examen1gi3.entities.Emprunt;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.Date;
import java.util.List;

public class EmpruntDao {
    public int save(Emprunt emprunt) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eclipselink");
        EntityManager em = emf.createEntityManager();

        emprunt.setDateEmprunt(new Date());

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            em.persist(emprunt);
            tx.commit();
            return 1;
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
            return 0;
        } finally {
            em.close();
            emf.close();
        }
    }

    public List<Emprunt> findAll() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eclipselink");
        EntityManager em = emf.createEntityManager();

        List<Emprunt> emprunts = null;

        try {
            emprunts = em.createQuery("SELECT e FROM Emprunt e", Emprunt.class).getResultList();
            return emprunts;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            em.close();
            emf.close();
        }
    }
}
