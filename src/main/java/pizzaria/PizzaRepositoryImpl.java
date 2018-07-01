package pizzaria;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Component
public class PizzaRepositoryImpl implements PizzaRepository {

    private Set<Pizza> pizzas = new HashSet();

    @Override
    public Pizza save(Pizza pizza) {
        pizzas.add(pizza);
        return pizza;
    }

    @Override
    public Set<Pizza> findAll() {
        return pizzas;
    }

    @Override
    public void delete(UUID id) {
        Pizza pizza = this.findOne(id);
        this.pizzas.remove(pizza);
    }

    @Override
    public Pizza findOne(UUID id) {
        for (Pizza pizza: pizzas) {
            if(pizza.getId().equals(id)) {
                return pizza;
            }
        }
        return null;
    }
}