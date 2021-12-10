package grupo3.heladeria.proyectoheladeria;
import static org.junit.Assert.assertEquals;

import com.grupo3.heladeria.proyectoheladeria.modelo.Insumo;

import jakarta.persistence.*;
import org.junit.*;

public class TestInsumo {

    @Test
    public void TestCrearInsumo() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        var insumo = new Insumo("Azucar","Bolsas 1KG", 10);

        em.getTransaction().begin();
        em.persist(insumo);
        em.getTransaction().commit();
        em.close();

        assertEquals(1, insumo.getIdInsumo());
    }

    @Test
    public void TestModificarInsumo() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        var insumo = new Insumo("Chocolate","Balde 20KG", 1);

        try {
            if (insumo != null) {
                em.getTransaction().begin();
                em.merge(insumo);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede modificar el insumo");
        }
        em.close();

        assertEquals("Chocolate", insumo.getNombre());
    }

    @Test
    public void TestBorrarInsumo() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        var insumo = em.find(Insumo.class, 2);

        try {
            if (insumo != null) {
                em.getTransaction().begin();
                em.remove(insumo);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede borrar el insumo");
        }
        em.close();
    }
    
}
