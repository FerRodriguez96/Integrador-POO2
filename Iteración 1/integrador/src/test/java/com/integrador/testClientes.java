package com.integrador;

import com.integrador.modelo.*;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.*;

public class testClientes {
    private static EntityManager manager;
    private static EntityManagerFactory emf;

    /**
     * @param args
     */
    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("persistencia");
        manager = emf.createEntityManager();
        // List<Cliente> clientes = (List<Cliente>) manager.createQuery("FROM
        // CLIENTE").getResultList();

        // System.out.println("En esta base de datos hay " + clientes.size() + "
        // clientes.");
        Cliente c = new Cliente(1, "Ruben", "Viera", "Escalada", 670);
        manager.getTransaction().begin();
        manager.persist(c);
        manager.getTransaction().commit();
        // List<Cliente> cte = (List<Cliente>) manager.createQuery("FROM
        // CLIENTE").getResultList();
        // System.out.println("Hay " + cte.size() + " clientes en la bd");

    }
}