package com.integrador.persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

public class Persistencia {
    private final EntityManager em;

    public Persistencia(EntityManagerFactory emf) {
        this.em = emf.createEntityManager();
    }

    public void iniciarTransaccion() {
        em.getTransaction().begin();
    }

    public void confirmarTransaccion() {
        em.getTransaction().commit();
    }

    public void descartarTransaccion() {
        em.getTransaction().rollback();
    }

    public void insertar(Object o) {
        this.em.persist(o);
    }
    
    public void modificar(Object o){
        this.em.merge(o);
    }

    public void eliminar(Object o){
        this.em.remove(o);
    }

    public void actualizar(Object o) {
        this.em.refresh(o);
    }
}