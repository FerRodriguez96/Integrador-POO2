package com.grupo3.heladeria.proyectoheladeria.repositorios;

import java.util.List;

import com.grupo3.heladeria.proyectoheladeria.modelo.Producto;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

public class RepositorioProductos implements InterfazProductos {

    private final EntityManagerFactory emf;

    public RepositorioProductos(EntityManagerFactory emf) {
        this.emf = emf;
    }

    
    /** 
     * @return List<Producto>
     */
    @Override
    public List<Producto> listar() {
        var em = emf.createEntityManager();
        var cb = em.getCriteriaBuilder();
        // se crea un objeto de consulta que devolvera objetos de producto
        var consulta = cb.createQuery(Producto.class);
        // definimos el origen de la consulta (FROM)
        var origen = consulta.from(Producto.class);
        consulta.select(origen);
        TypedQuery<Producto> query = em.createQuery(consulta);
        var productos = query.getResultList();
        em.close();
        return productos;
    }

    
    /** 
     * @param idProducto
     * @return Producto
     */
    @Override
    public Producto obtener(Integer idProducto) {
        var em = emf.createEntityManager();
        var producto = em.find(Producto.class, idProducto);
        em.close();
        return producto;
    }

    
    /** 
     * @param producto
     */
    @Override
    public void crear(Producto producto) {
        var em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(producto);
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
        var producto = em.find(Producto.class, idProducto);
        try {
            if (producto != null) {
                em.getTransaction().begin();
                em.remove(producto);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede borrar el Producto");
        }
        em.close();
        return (producto != null);
    }

    
    /** 
     * @param producto
     * @return Producto
     */
    @Override
    public Producto modificar(Producto producto) {
        var em = emf.createEntityManager();
        try {
            if (producto != null) {
                em.getTransaction().begin();
                em.merge(producto);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede modificar el Producto");
        }
        em.close();
        return producto;
    }

}