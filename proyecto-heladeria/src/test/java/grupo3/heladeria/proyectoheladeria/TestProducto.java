package grupo3.heladeria.proyectoheladeria;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.grupo3.heladeria.proyectoheladeria.modelo.Bombon;
import com.grupo3.heladeria.proyectoheladeria.modelo.Picole;
import com.grupo3.heladeria.proyectoheladeria.modelo.Sabores;

import org.junit.Test;
import jakarta.persistence.Persistence;

public class TestProducto {

    @Test
    public void testCrearBombon() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        var bombon = new Bombon(500, Sabores.Dulce_de_leche, 20);

        em.getTransaction().begin();
        em.persist(bombon);
        em.getTransaction().commit();
        assertEquals(bombon, em.find(Bombon.class, 1));
        em.close();
    }

    @Test
    public void testCrearPicole() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        var picole = new Picole(500, Sabores.Surtido, 50);

        em.getTransaction().begin();
        em.persist(picole);
        em.getTransaction().commit();

        assertEquals(picole, em.find(Picole.class, 2));
        em.close();
    }

    @Test
    public void testBorrarBombon() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();
        var bombon = em.find(Bombon.class, 1);
        try {
            if (bombon != null) {
                em.getTransaction().begin();
                em.remove(bombon);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede borrar el bombon");
        }
        assertNull(em.find(Bombon.class, 1));
        em.close();
    }

    @Test
    public void testBorrarPicole() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();
        var picole = em.find(Picole.class, 2);
        try {
            if (picole != null) {
                em.getTransaction().begin();
                em.remove(picole);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede borrar el picole");
        }
        assertNull(em.find(Picole.class, 2));
        em.close();
    }

}