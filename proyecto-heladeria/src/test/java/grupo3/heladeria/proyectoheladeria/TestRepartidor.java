package grupo3.heladeria.proyectoheladeria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.grupo3.heladeria.proyectoheladeria.modelo.Repartidor;

import jakarta.persistence.*;
import org.junit.*;

public class TestRepartidor {

    @Test
    public void testCrearJornalero() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        em.getTransaction().begin();
        var repartidor = new Repartidor(36408456, "Rodriguez", "Fernando", "3764626262" , "correo@correo");
        em.persist(repartidor);
        em.getTransaction().commit();
        em.close();

        assertEquals(36408456, repartidor.getDni());
    }

    @Test
    @AfterClass
    public void testModificarCliente(){
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        var repartidor = new Repartidor(36408456, "Rodriguez", "Facundo", "3764626262" , "correo@correo");

        em.getTransaction().begin();
        em.merge(repartidor);
        em.getTransaction().commit();

        assertEquals("Facundo", repartidor.getNombre());

    }

    @Test
    @AfterClass
    public void testEliminarCliente(){
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        var repartidor = new Repartidor(36408456, "Rodriguez", "Fernando", "3764626262" , "correo@correo");

        try {
            if (repartidor != null) {
                em.getTransaction().begin();
                em.remove(repartidor);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede borrar el cliente");
        }
        em.close();

        assertNull(repartidor);
    }
    
}
