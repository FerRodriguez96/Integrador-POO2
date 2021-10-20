package com.proyectoheladeria;

import javax.persistence.*;

import com.modelo.*;

public class TestRepartidor {
	
	private static EntityManager em;
	
	private static EntityManagerFactory emf;
	
	public static void main(String[] args) {
		/* Crear el gestor de persistencia (EM) */
		emf = Persistence.createEntityManagerFactory("Persistencia");
		em = emf.createEntityManager();
		
		Repartidor r = new Repartidor(36408456,1,"victor","manuel","3764112233","correo@correo");
		
		em.getTransaction().begin();
		
		em.persist(r);
		
		em.getTransaction().commit();
		
	}
	
}
