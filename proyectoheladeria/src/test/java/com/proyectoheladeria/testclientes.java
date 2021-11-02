package com.proyectoheladeria;

import java.util.List;

import com.modelo.Cliente;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class testclientes {
    private static EntityManager manager;
    private static EntityManagerFactory emf;

    /**
     * @param args
     */
    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("persistencia");
        manager = emf.createEntityManager();
        /*
         * List<Cliente> clientes = (List<Cliente>)
         * manager.createQuery("FROM CLIENTE").getResultList();
         * 
         * System.out.println("En esta base de datos hay " + clientes.size() +
         * " clientes.");
         */
        Cliente c = new Cliente(1, "Ruben", "Viera", "Escalada", 670);
        manager.getTransaction().begin();
        manager.persist(c);
        manager.getTransaction().commit();
        c.toString();
        /*
         * List<Cliente> cte = (List<Cliente>)
         * manager.createQuery("FROM CLIENTE").getResultList();
         * System.out.println("Hay " + cte.size() + " clientes en la bd");
         */

    }
}