
import com.grupo3.heladeria.proyectoheladeria.modelo.Bombon;
import com.grupo3.heladeria.proyectoheladeria.modelo.Picole;
import com.grupo3.heladeria.proyectoheladeria.modelo.Sabores;

import org.junit.AfterClass;
import org.junit.Test;
import jakarta.persistence.Persistence;

public class testProductos {

    @Test
    public void testCrearBombon() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        
        var em = emf.createEntityManager();
        em.getTransaction().begin();
        var bombon = new Bombon(10, Sabores.Dulce_de_leche, 50);
        em.persist(bombon);
        em.getTransaction().commit();
        bombon = em.find(Bombon.class, 1);
        bombon.toString();
        em.close();
    }
    @Test
    public void testCrearPicole() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();
        em.getTransaction().begin();
        var picole = new Picole(10, Sabores.Dulce_de_leche, 50);
        em.persist(picole);
        em.getTransaction().commit();
        picole = em.find(Picole.class, 1);
        picole.toString();
        em.close();
    }
    @Test
    @AfterClass
    public void testborrarbombon() {
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
        em.close();
    }
    @Test
    @AfterClass
    public void testborrarpicole() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();
        var picole = em.find(Picole.class, 1);
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
    }
    
}
