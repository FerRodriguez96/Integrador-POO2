package repositorio;

import java.util.List;
import com.integrador.modelo.Cliente;

public interface ClientesRepositorio {
    List<Cliente> listar() throws RepositorioExcepcion;
}
