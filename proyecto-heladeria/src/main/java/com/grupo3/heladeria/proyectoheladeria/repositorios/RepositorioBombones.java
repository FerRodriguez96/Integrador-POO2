package com.grupo3.heladeria.proyectoheladeria.repositorios;

import java.util.List;

import com.grupo3.heladeria.proyectoheladeria.modelo.Bombon;
//import com.grupo3.heladeria.proyectoheladeria.modelo.Sabor;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

public class RepositorioBombones implements InterfazBombones {

    private final EntityManagerFactory emf;

    public RepositorioBombones(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<Bombon> listar() {
        var em = emf.createEntityManager();
        var cb = em.getCriteriaBuilder();
        // se crea un objeto de consulta que devolvera objetos de bombon
        var consulta = cb.createQuery(Bombon.class);
        // definimos el origen de la consulta (FROM)
        var origen = consulta.from(Bombon.class);
        consulta.select(origen);
        TypedQuery<Bombon> query = em.createQuery(consulta);
        var bombones = query.getResultList();
        em.close();
        return bombones;
    }

    @Override
    public Bombon obtener(String sabor) {
        var em = emf.createEntityManager();
        var bombon = em.find(Bombon.class, sabor);
        em.close();
        return bombon;
    }

    @Override
    public void crear(Bombon bombon) {
        var em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(bombon);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public boolean borrar(String sabor) {

        var em = emf.createEntityManager();
        var bombon = em.find(Bombon.class, sabor);
        try {
            if (bombon != null) {
                em.getTransaction().begin();
                em.remove(bombon);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede borrar el bombon");
        }
        em.close();
        return (bombon != null);
    }

}