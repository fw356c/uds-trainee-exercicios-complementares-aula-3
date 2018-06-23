package pizzaria;

import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class PizzaRepositoryImpl implements PizzaRepository{

    private Set<Pizza> pizzas = new HashSet<>();

    @Override
    public Pizza save(Pizza pizza) {
        pizzas.add(pizza);
        return pizza;
    }
}