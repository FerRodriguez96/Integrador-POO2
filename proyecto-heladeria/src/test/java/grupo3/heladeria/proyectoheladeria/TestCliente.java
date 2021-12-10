package grupo3.heladeria.proyectoheladeria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.grupo3.heladeria.proyectoheladeria.modelo.Cliente;
import jakarta.persistence.*;
import org.junit.*;

public class TestCliente {

    @Test
    public void testCrearCliente() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        em.getTransaction().begin();
        var cliente = new Cliente(36408456, "Rodriguez", "Fernando", "Roque Gonzalez", 16, "3764626262");
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();

        assertEquals(36408456, cliente.getDni());
    }

    @Test
    public void testModificarCliente(){
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        var cliente = new Cliente(36408456, "Facundo", "Rodriguez", "Roque Gonzalez", 16, "3764626262");

        em.getTransaction().begin();
        em.merge(cliente);
        em.getTransaction().commit();

        assertEquals("Facundo", cliente.getNombre());

    }

    @Test
    public void testEliminarCliente(){
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        var cliente = em.find(Cliente.class, 36408456);
        
        try {
            if (cliente != null) {
                em.getTransaction().begin();
                em.remove(cliente);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede borrar el cliente");
        }
        assertNull(em.find(Cliente.class, 36408456));
        em.close();
    }
    
}
