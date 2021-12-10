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
        var repartidor = new Repartidor(36408555, "Fernando", "Fernandez", "3764626262" , "correo@correo");
        em.persist(repartidor);
        em.getTransaction().commit();
        em.close();

        assertEquals(36408555, repartidor.getDni());
    }

    @Test
    public void testModificarRepartidor(){
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        var repartidor = new Repartidor(36408555, "Facundo", "Fernandez", "3764626262" , "correo@correo");

        em.getTransaction().begin();
        em.merge(repartidor);
        em.getTransaction().commit();

        assertEquals("Facundo", repartidor.getNombre());
    }

    @Test
    public void testEliminarRepartidor(){
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        var repartidor = em.find(Repartidor.class, 364084555);
        
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
    }
    
}
