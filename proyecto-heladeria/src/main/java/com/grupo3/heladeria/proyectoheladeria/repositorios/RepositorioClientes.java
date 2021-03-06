package com.grupo3.heladeria.proyectoheladeria.repositorios;

import java.util.List;

import com.grupo3.heladeria.proyectoheladeria.modelo.Cliente;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

public class RepositorioClientes implements InterfazClientes {

    private final EntityManagerFactory emf;

    public RepositorioClientes(EntityManagerFactory emf) {
        this.emf = emf;
    }

    
    /** 
     * @return List<Cliente>
     */
    @Override
    public List<Cliente> listar() {
        var em = emf.createEntityManager();
        var cb = em.getCriteriaBuilder();
        // se crea un objeto de consulta que devolvera objetos de cliente
        var consulta = cb.createQuery(Cliente.class);
        // definimos el origen de la consulta (FROM)
        var origen = consulta.from(Cliente.class);
        consulta.select(origen);
        TypedQuery<Cliente> query = em.createQuery(consulta);
        var clientes = query.getResultList();
        em.close();
        return clientes;
    }

    
    /** 
     * @param dni
     * @return Cliente
     */
    @Override
    public Cliente obtener(int dni) {
        var em = emf.createEntityManager();
        var cliente = em.find(Cliente.class, dni);
        em.close();
        return cliente;
    }

    
    /** 
     * @param cliente
     */
    @Override
    public void crear(Cliente cliente) {
        var em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(cliente);
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
        var cliente = em.find(Cliente.class, dni);
        try {
            if (cliente != null) {
                em.getTransaction().begin();
                em.remove(cliente);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede borrar el cliente");
        }
        em.close();
        return (cliente != null);
    }

    
    /** 
     * @param cliente
     * @return Cliente
     */
    @Override
    public Cliente modificar(Cliente cliente) {
        var em = emf.createEntityManager();
        try {
            if (cliente != null) {
                em.getTransaction().begin();
                em.merge(cliente);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede modificar el cliente");
        }
        em.close();
        return cliente;
    }

}