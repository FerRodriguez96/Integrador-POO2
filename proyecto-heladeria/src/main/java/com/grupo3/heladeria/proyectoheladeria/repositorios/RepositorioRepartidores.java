package com.grupo3.heladeria.proyectoheladeria.repositorios;

import java.util.List;

import com.grupo3.heladeria.proyectoheladeria.modelo.Repartidor;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

public class RepositorioRepartidores implements InterfazRepartidores {

    private final EntityManagerFactory emf;

    public RepositorioRepartidores(EntityManagerFactory emf) {
        this.emf = emf;
    }

    
    /** 
     * @return List<Repartidor>
     */
    @Override
    public List<Repartidor> listar() {
        var em = emf.createEntityManager();
        var cb = em.getCriteriaBuilder();
        // se crea un objeto de consulta que devolvera objetos de repartidor
        var consulta = cb.createQuery(Repartidor.class);
        // definimos el origen de la consulta (FROM)
        var origen = consulta.from(Repartidor.class);
        consulta.select(origen);
        TypedQuery<Repartidor> query = em.createQuery(consulta);
        var repartidor = query.getResultList();
        em.close();
        return repartidor;
    }

    
    /** 
     * @param id
     * @return Repartidor
     */
    @Override
    public Repartidor obtener(int id) {
        var em = emf.createEntityManager();
        var repartidor = em.find(Repartidor.class, id);
        em.close();
        return repartidor;
    }

    
    /** 
     * @param repartidor
     */
    @Override
    public void crear(Repartidor repartidor) {
        var em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(repartidor);
        em.getTransaction().commit();
        em.close();
    }

    
    /** 
     * @param dni
     * @return boolean
     */
    @Override
    public boolean borrar(int dni) {

        var em = emf.createEntityManager();
        var repartidor = em.find(Repartidor.class, dni);
        try {
            if (repartidor != null) {
                em.getTransaction().begin();
                em.remove(repartidor);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede borrar el repartidor");
        }
        em.close();
        return (repartidor != null);
    }

    
    /** 
     * @param repartidor
     * @return Repartidor
     */
    @Override
    public Repartidor modificar(Repartidor repartidor) {
        var em = emf.createEntityManager();
        try {
            if (repartidor != null) {
                em.getTransaction().begin();
                em.merge(repartidor);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede modificar el repartidor");
        }
        em.close();
        return repartidor;
    }
}