package pizzaria;

import javax.naming.NamingException;
import java.util.Set;
import java.util.UUID;

public interface PizzaService {

    Pizza salvar(PizzaDTO pizzaDTO);

    Pizza editar(UUID id, PizzaDTO pizzaDTO);

    Pizza obter(UUID id);

    Set<Pizza> listar();

    void remover(UUID id);

}
