package com.repositorios;

import com.modelo.Picole;
import com.modelo.Sabor;
import java.util.List;
import javax.persistence.*;

public class RepositorioPicoles implements InterfazPicoles {
	
	private final EntityManagerFactory emf;

	public RepositorioPicoles(EntityManagerFactory emf) {
		this.emf = emf;
	}
	
	@Override
	public List<Picole> listar() {
        var em = emf.createEntityManager();
        var cb = em.getCriteriaBuilder();
        // se crea un objeto de consulta que devolvera objetos de picole
        var consulta = cb.createQuery(Picole.class);
        // definimos el origen de la consulta (FROM)
        var origen = consulta.from(Picole.class);
        consulta.select(origen);
        TypedQuery<Picole> query = em.createQuery(consulta);
        var picoles = query.getResultList();
        em.close();
        return picoles;
    }
	
	@Override
	public Picole obtener(Sabor sabor) {
        var em = emf.createEntityManager();
        var bombon = em.find(Picole.class, sabor);
        em.close();
        return bombon;
    }
	
	@Override
	public void crear(Picole picole) {
        var em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(picole);
        em.getTransaction().commit();
        em.close();
    }
	
	@Override
	public boolean borrar(Sabor sabor) {

        var em = emf.createEntityManager();
        var picole = em.find(Picole.class, sabor);
        try {
            if (picole != null) {
                em.getTransaction().begin();
                em.remove(picole);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede borrar el picole");
        }
        em.close();
        return (picole != null);
    }

}