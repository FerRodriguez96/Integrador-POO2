package com.grupo3.heladeria.proyectoheladeria.repositorios;

import java.util.List;

import com.grupo3.heladeria.proyectoheladeria.modelo.Picole;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

public class RepositorioPicoles implements InterfazPicoles {

    private final EntityManagerFactory emf;

    public RepositorioPicoles(EntityManagerFactory emf) {
        this.emf = emf;
    }

    
    /** 
     * @return List<Picole>
     */
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

    
    /** 
     * @param id
     * @return Picole
     */
    @Override
    public Picole obtener(Integer id) {
        var em = emf.createEntityManager();
        var Picole = em.find(Picole.class, id);
        em.close();
        return Picole;
    }

    
    /** 
     * @param Picole
     */
    @Override
    public void crear(Picole Picole) {
        var em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(Picole);
        em.getTransaction().commit();
        em.close();
    }

    
    /** 
     * @param idProducto
     * @return boolean
     */
    @Override
    public boolean borrar(Integer idProducto) {

        var em = emf.createEntityManager();
        var Picole = em.find(Picole.class, idProducto);
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

    
    /** 
     * @param picole
     * @return Picole
     */
    @Override
    public Picole modificar(Picole picole) {
        var em = emf.createEntityManager();
        try {
            if (picole != null) {
                em.getTransaction().begin();
                em.merge(picole);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede modificar el picole");
        }
        em.close();
        return picole;

    }

}