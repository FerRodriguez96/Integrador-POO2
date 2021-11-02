package com.repositorios;

import java.util.List;

import com.modelo.Jornalero;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

public class RepositorioJornaleros implements InterfazJornaleros {

    private final EntityManagerFactory emf;

    public RepositorioJornaleros(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<Jornalero> listar() {
        var em = emf.createEntityManager();
        var cb = em.getCriteriaBuilder();
        // se crea un objeto de consulta que devolvera objetos de Jornalero
        var consulta = cb.createQuery(Jornalero.class);
        // definimos el origen de la consulta (FROM)
        var origen = consulta.from(Jornalero.class);
        consulta.select(origen);
        TypedQuery<Jornalero> query = em.createQuery(consulta);
        var jornaleros = query.getResultList();
        em.close();
        return jornaleros;
    }

    @Override
    public Jornalero obtener(int dni) {
        var em = emf.createEntityManager();
        var jornalero = em.find(Jornalero.class, dni);
        em.close();
        return jornalero;
    }

    @Override
    public void crear(Jornalero jornalero) {
        var em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(jornalero);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public boolean borrar(int dni) {

        var em = emf.createEntityManager();
        var jornalero = em.find(Jornalero.class, dni);
        try {
            if (jornalero != null) {
                em.getTransaction().begin();
                em.remove(jornalero);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede borrar el jornalero");
        }
        em.close();
        return (jornalero != null);
    }

}