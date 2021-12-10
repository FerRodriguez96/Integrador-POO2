package grupo3.heladeria.proyectoheladeria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.grupo3.heladeria.proyectoheladeria.modelo.Jornalero;

import jakarta.persistence.*;
import org.junit.*;

public class TestJornalero {

    @Test
    public void testCrearJornalero() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        em.getTransaction().begin();
        var jornalero = new Jornalero(36408456, "Fernando", "Rodriguez", "3764626262" , "correo@correo");
        em.persist(jornalero);
        em.getTransaction().commit();
        em.close();

        assertEquals(36408456, jornalero.getDni());
    }

    @Test
    public void testModificarCliente(){
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        var jornalero = new Jornalero(36408456, "Facundo", "Rodriguez", "3764626262" , "correo@correo");

        em.getTransaction().begin();
        em.merge(jornalero);
        em.getTransaction().commit();

        assertEquals("Facundo", jornalero.getNombre());

    }

    @Test
    public void testEliminarCliente(){
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        var jornalero = em.find(Jornalero.class, 36408456);
        
        try {
            if (jornalero != null) {
                em.getTransaction().begin();
                em.remove(jornalero);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede borrar el jornalero");
        }
        assertNull(em.find(Jornalero.class, 36408456));
        em.close();
    }
    
}
