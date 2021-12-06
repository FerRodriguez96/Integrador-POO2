package com.grupo3.heladeria.proyectoheladeria.repositorios;

import java.util.List;

import com.grupo3.heladeria.proyectoheladeria.modelo.Proveedor;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

public class RepositorioProveedores implements InterfazProveedores {

    private final EntityManagerFactory emf;

    public RepositorioProveedores(EntityManagerFactory emf) {
        this.emf = emf;
    }

    @Override
    public List<Proveedor> listar() {
        var em = emf.createEntityManager();
        var cb = em.getCriteriaBuilder();
        // se crea un objeto de consulta que devolvera objetos de proveedor
        var consulta = cb.createQuery(Proveedor.class);
        // definimos el origen de la consulta (FROM)
        var origen = consulta.from(Proveedor.class);
        consulta.select(origen);
        TypedQuery<Proveedor> query = em.createQuery(consulta);
        var proveedores = query.getResultList();
        em.close();
        return proveedores;
    }

    @Override
    public Proveedor obtener(int id) {
        var em = emf.createEntityManager();
        var proveedor = em.find(Proveedor.class, id);
        em.close();
        return proveedor;
    }

    @Override
    public void crear(Proveedor proveedor) {
        var em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(proveedor);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public boolean borrar(int id) {
        var em = emf.createEntityManager();
        var proveedor = em.find(Proveedor.class, id);
        try {
            if (proveedor != null) {
                em.getTransaction().begin();
                em.remove(proveedor);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede borrar el proveedor");
        }
        em.close();
        return (proveedor != null);
    }

    @Override
    public Proveedor modificar(Proveedor proveedor) {
        var em = emf.createEntityManager();
        try {
            if (proveedor != null) {
                em.getTransaction().begin();
                em.merge(proveedor);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede modificar el proveedor");
        }
        em.close();
        return proveedor;
    }

}