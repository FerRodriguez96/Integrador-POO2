package com.repositorios;

import java.util.List;

import com.modelo.Sabor;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

public class RepositorioSabores implements InterfazSabores {

    private final EntityManagerFactory emf;

    public RepositorioSabores(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<Sabor> listar() {
        var em = emf.createEntityManager();
        var cb = em.getCriteriaBuilder();
        // se crea un objeto de consulta que devolvera objetos de sabor
        var consulta = cb.createQuery(Sabor.class);
        // definimos el origen de la consulta (FROM)
        var origen = consulta.from(Sabor.class);
        consulta.select(origen);
        TypedQuery<Sabor> query = em.createQuery(consulta);
        var sabores = query.getResultList();
        em.close();
        return sabores;
    }

    @Override
    public Sabor obtener(int id) {
        var em = emf.createEntityManager();
        var sabor = em.find(Sabor.class, id);
        em.close();
        return sabor;
    }

    @Override
    public void crear(Sabor sabor) {
        var em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(sabor);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public boolean borrar(int id) {

        var em = emf.createEntityManager();
        var sabor = em.find(Sabor.class, id);
        try {
            if (sabor != null) {
                em.getTransaction().begin();
                em.remove(sabor);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede borrar el sabor");
        }
        em.close();
        return (sabor != null);
    }

}