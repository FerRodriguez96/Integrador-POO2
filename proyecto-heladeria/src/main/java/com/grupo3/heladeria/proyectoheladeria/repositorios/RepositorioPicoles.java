package com.grupo3.heladeria.proyectoheladeria.repositorios;

import java.util.List;

import com.grupo3.heladeria.proyectoheladeria.modelo.Picole;
//import com.grupo3.heladeria.proyectoheladeria.modelo.Sabor;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

public class RepositorioPicoles implements InterfazPicoles {

    private final EntityManagerFactory emf;

    public RepositorioPicoles(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<Picole> listar() {
        var em = emf.createEntityManager();
        var cb = em.getCriteriaBuilder();
        // se crea un objeto de consulta que devolvera objetos de Picole
        var consulta = cb.createQuery(Picole.class);
        // definimos el origen de la consulta (FROM)
        var origen = consulta.from(Picole.class);
        consulta.select(origen);
        TypedQuery<Picole> query = em.createQuery(consulta);
        var picoles = query.getResultList();
        em.close();
        return picoles;
    }

    @Override
    public Picole obtener(String sabor) {
        var em = emf.createEntityManager();
        var Picole = em.find(Picole.class, sabor);
        em.close();
        return Picole;
    }

    @Override
    public void crear(Picole Picole) {
        var em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(Picole);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public boolean borrar(String sabor) {

        var em = emf.createEntityManager();
        var Picole = em.find(String.class, sabor);
        try {
            if (Picole != null) {
                em.getTransaction().begin();
                em.remove(Picole);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede borrar el Picole");
        }
        em.close();
        return (Picole != null);
    }

}