package grupo3.heladeria.proyectoheladeria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.grupo3.heladeria.proyectoheladeria.modelo.Repartidor;

import jakarta.persistence.*;
import org.junit.*;

public class TestRepartidor {

    @Test
    public void testCrearRepartidor() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        em.getTransaction().begin();
        var repartidor = new Repartidor(36408456, "Fernando", "Rodriguez", "3764626262" , "correo@correo");
        em.persist(repartidor);
        em.getTransaction().commit();
        em.close();

        assertEquals(36408456, repartidor.getDni());
    }

    @Test
    public void testModificarRepartidor(){
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        var repartidor = new Repartidor(36408456, "Facundo", "Rodriguez", "3764626262" , "correo@correo");

        em.getTransaction().begin();
        em.merge(repartidor);
        em.getTransaction().commit();

        assertEquals("Facundo", repartidor.getNombre());
    }

    @Test
    public void testEliminarRepartidor(){
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        var repartidor = em.find(Repartidor.class, 36408456);
        
        try {
            if (repartidor != null) {
                em.getTransaction().begin();
                em.remove(repartidor);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede borrar el repartidor");
        }
        assertNull(em.find(Repartidor.class, 36408456));
        em.close();
    }
    
}
