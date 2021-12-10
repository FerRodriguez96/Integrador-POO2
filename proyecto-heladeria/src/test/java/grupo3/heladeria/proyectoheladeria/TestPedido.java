package grupo3.heladeria.proyectoheladeria;

import static org.junit.Assert.assertEquals;

import com.grupo3.heladeria.proyectoheladeria.modelo.Bombon;
import com.grupo3.heladeria.proyectoheladeria.modelo.Cliente;
import com.grupo3.heladeria.proyectoheladeria.modelo.Pedido;
import com.grupo3.heladeria.proyectoheladeria.modelo.Repartidor;
import com.grupo3.heladeria.proyectoheladeria.modelo.Sabores;

import org.junit.Test;

import jakarta.persistence.Persistence;

public class TestPedido {

    @Test
    public void testCrearCliente() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        var cliente = new Cliente(12118789, "Rodriguez", "Jorge", "Roque Cruz", 16, "3764626262");

        em.getTransaction().begin();
        em.persist(cliente);
        em.getTransaction().commit();
        em.close();

        assertEquals(12118789, cliente.getDni());
    }

    @Test
    public void TestCrearBombon() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        var bombon = new Bombon(500, Sabores.Frutilla, 20);

        em.getTransaction().begin();
        em.persist(bombon);
        em.getTransaction().commit();
        assertEquals(bombon, em.find(Bombon.class, 1));
        em.close();
    }
    
    @Test
    public void TestCrearRepartidor() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        var repartidor = new Repartidor(12885926, "Ivan", "Konev", "3764626262" , "correo@correo");

        em.getTransaction().begin();
        em.persist(repartidor);
        em.getTransaction().commit();
        em.close();

        assertEquals(12885926, repartidor.getDni());
    }

    @Test
    public void TestCrearPedido() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();

        em.getTransaction().begin();
        var pedido = new Pedido();
        em.persist(pedido);
        em.getTransaction().commit();
        em.close();
    }

    @Test
    public void TestBorrarPedido() {
        var emf = Persistence.createEntityManagerFactory("persistencia");
        var em = emf.createEntityManager();
        var pedido = em.find(Pedido.class, 1);
        try {
            if (pedido != null) {
                em.getTransaction().begin();
                em.remove(pedido);
                em.getTransaction().commit();
            }
        } catch (Exception e) {
            System.out.println("No se puede borrar el pedido");
        }
        em.close();
    }
}
