package com.grupo3.heladeria.proyectoheladeria.repositorios;

import java.util.List;

import com.grupo3.heladeria.proyectoheladeria.modelo.Insumo;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

public class RepositorioInsumos implements InterfazInsumos {

    private final EntityManagerFactory emf;

    public RepositorioInsumos(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<Insumo> listar() {
        var em = emf.createEntityManager();
        var cb = em.getCriteriaBuilder();
        // se crea un objeto de consulta que devolvera objetos de insumo
        var consulta = cb.createQuery(Insumo.class);
        // definimos el origen de la consulta (FROM)
        var origen = consulta.from(Insumo.class);
        consulta.select(origen);
        TypedQuery<Insumo> query = em.createQuery(consulta);
        var insumos = query.getResultList();
        em.close();
        return insumos;
    }

    @Override
    public Insumo obtener(int id) {
        var em = emf.createEntityManager();
        var insumo = em.find(Insumo.class, id);
        em.close();
        return insumo;
    }

    @Override
    public void crear(Insumo insumo) {
        var em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(insumo);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public boolean borrar(int id) {
        var em = emf.createEntityManager();
        var insumo = em.find(Insumo.class, id);
        try {
            if (insumo != null) {
                em.getTransaction().begin();
                em.remove(insumo);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede borrar el insumo");
        }
        em.close();
        return (insumo != null);
    }

    @Override
    public Insumo modificar(Insumo insumo) {
        var em = emf.createEntityManager();
        try {
            if (insumo != null) {
                em.getTransaction().begin();
                em.merge(insumo);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede modificar el insumo");
        }
        em.close();
        return insumo;
    }

}