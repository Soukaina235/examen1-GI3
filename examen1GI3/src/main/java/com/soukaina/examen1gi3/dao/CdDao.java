package com.soukaina.examen1gi3.dao;

import com.soukaina.examen1gi3.entities.CD;
import jakarta.persistence.*;

import java.util.List;

public class CdDao {
    public int save(CD cd) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eclipselink");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            em.persist(cd);
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

    public boolean delete(CD cd) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eclipselink");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            if (cd != null) {
                CD managedCd = em.merge(cd);
                em.remove(managedCd);tx.commit();
                return true; // Indicates successful deletion
            } else {
                return false; // Indicates employee not found
            }
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
            return false; // Indicates failure in deletion
        } finally {
            em.close();
            emf.close();
        }
    }

    public boolean edit(CD cd) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eclipselink");
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            em.merge(cd);
            em.flush();
            tx.commit();
            return true;
        } catch (Exception e) {
            if (tx.isActive()) {
                tx.rollback();
            }
            e.printStackTrace();
            return false;
        } finally {
            em.close();
            emf.close();
        }
    }

    public List<CD> findAll() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Eclipselink");
        EntityManager em = emf.createEntityManager();

        List<CD> cds = null;

        try {
            cds = em.createQuery("SELECT c FROM CD c", CD.class).getResultList();
            return cds;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            em.close();
            emf.close();
        }
    }
}
