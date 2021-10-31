package com.repositorios;

import com.modelo.Pedido;
import java.util.List;
import javax.persistence.*;

public class RepositorioPedidos {
	
	private final EntityManagerFactory emf;

	public RepositorioPedidos(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	public List<Pedido> listar() {
        var em = emf.createEntityManager();
        var cb = em.getCriteriaBuilder();
        // se crea un objeto de consulta que devolvera objetos de Curso
        var consulta = cb.createQuery(Pedido.class);
        // definimos el origen de la consulta (FROM)
        var origen = consulta.from(Pedido.class);
        consulta.select(origen);
        TypedQuery<Pedido> query = em.createQuery(consulta);
        var pedidos = query.getResultList();
        em.close();
        return pedidos;
    }
	
	public Pedido obtener(int id) {
        var em = emf.createEntityManager();
        var pedido = em.find(Pedido.class, id);
        em.close();
        return pedido;
    }
	
	public void crear(Pedido pedido) {
        var em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(pedido);
        em.getTransaction().commit();
        em.close();
    }
	
	public boolean borrar(int id) {

        var em = emf.createEntityManager();
        var pedido = em.find(Pedido.class, id);
        try {
            if (pedido != null) {
                em.getTransaction().begin();
                em.remove(pedido);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede borrar el pedido");
        }
        em.close();
        return (pedido != null);
    }

}
