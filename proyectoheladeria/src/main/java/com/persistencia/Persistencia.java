package com.persistencia;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.SingularAttribute;

public class Persistencia {
    private final EntityManager em;

    public Persistencia(EntityManagerFactory emf) {
        this.em = emf.createEntityManager();
    }

    public void iniciarTransaccion() {
        em.getTransaction().begin();
    }

    public void confirmarTransaccion() {
        em.getTransaction().commit();
    }

    public void descartarTransaccion() {
        em.getTransaction().rollback();
    }

    /**
     * @param o
     */
    public void insertar(Object o) {
        this.em.persist(o);
    }

    /**
     * @param o
     */
    public void modificar(Object o) {
        this.em.merge(o);
    }

    /**
     * @param o
     */
    public void eliminar(Object o) {
        this.em.remove(o);
    }

    /**
     * @param o
     */
    public void refrescar(Object o) {
        this.em.refresh(o);
    }

    /**
     * @param clase
     * @param id
     * @return T
     */
    // Metodo generico
    // Acepta cualquier tipo (T) que extienda de Object
    // Devuelve un objeto de tipo (T)
    public <T extends Object> T buscar(Class<T> clase, Object id) {
        return (T) this.em.find(clase, id);
    }

    /**
     * @param clase
     * @return List<T>
     */
    // Metodo generico
    // Acepta cualquier tipo (T) que extienda de Object
    // Devuelve una lista de ese tipo (T)
    public <T extends Object> List<T> buscarTodos(Class<T> clase) {
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery<T> consulta = cb.createQuery(clase);
        Root<T> inicio = consulta.from(clase);
        return em.createQuery(consulta).getResultList();
    }

    /**
     * @param clase
     * @param orden
     * @return List<T>
     */
    // el parametro de orden a pasar se obtiene del metamodelo generado por
    // EclipseLink
    public <T extends Object, P extends Object> List<T> buscarTodosOrdenadosPor(Class<T> clase,
            SingularAttribute<T, P> orden) {
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery<T> consulta = cb.createQuery(clase);
        Root<T> inicio = consulta.from(clase);
        consulta.orderBy(cb.asc(inicio.get(orden)));
        return em.createQuery(consulta).getResultList();
    }
}