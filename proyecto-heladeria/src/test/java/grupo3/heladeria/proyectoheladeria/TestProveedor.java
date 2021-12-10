package grupo3.heladeria.proyectoheladeria;
import static org.junit.Assert.assertEquals;

import com.grupo3.heladeria.proyectoheladeria.modelo.Proveedor;

import jakarta.persistence.*;
import org.junit.*;

public class TestProveedor {

    @Test
    public void TestCrearProveedor() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();
        
        var proveedor = new Proveedor("Jorge","Smith", "Ford","3756897486");

        em.getTransaction().begin();
        em.persist(proveedor);
        em.getTransaction().commit();
        em.close();

        assertEquals(2, proveedor.getIdProveedor());

    }

    @Test
    public void TestModificarProveedor() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();
        var proveedor = new Proveedor("Jorge","Smith", "Chevrolet","3756897486");
        try {
            if (proveedor != null) {
                em.getTransaction().begin();
                em.merge(proveedor);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede modificar el proveedor");
        }
        em.close();

        assertEquals("Chevrolet", proveedor.getEmpresa());
    }
    
    @Test
    public void TestBorrarProveedor() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();
        var proveedor = new Proveedor("Jorge","Ford", "Madesel","3756897486");
        try {
            if (proveedor != null) {
                em.getTransaction().begin();
                em.remove(proveedor);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede borrar el proveedor");
        }
        em.close();
    }
}
