package com.repositorios;

import com.modelo.Repartidor;
import java.util.List;
import javax.persistence.*;

public class RepositorioRepartidores implements InterfazRepartidores {
	
	private final EntityManagerFactory emf;

	public RepositorioRepartidores(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
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
	
	@Override
	public Repartidor obtener(int id) {
        var em = emf.createEntityManager();
        var repartidor = em.find(Repartidor.class, id);
        em.close();
        return repartidor;
    }
	
	@Override
	public void crear(Repartidor repartidor) {
        var em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(repartidor);
        em.getTransaction().commit();
        em.close();
    }
	
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

}
