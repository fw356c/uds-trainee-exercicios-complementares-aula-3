package pizzaria;

import java.util.Set;
import java.util.UUID;

public interface PizzaRepository {

    Pizza save(Pizza pizza);

    Set<Pizza> findAll();

    void delete(UUID id);

    Pizza findOne(UUID id);
}

