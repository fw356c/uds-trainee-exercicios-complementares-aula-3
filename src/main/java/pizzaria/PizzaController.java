package pizzaria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;
import java.util.UUID;

@RestController
@RequestMapping("/api/pizzas")
public class PizzaController {

    @Autowired
    private PizzaService pizzaService;

    @PostMapping
    public ResponseEntity criar(@RequestBody PizzaDTO pizzaDTO) {
        Pizza pizzaCriada = this.pizzaService.salvar(pizzaDTO);
        return new ResponseEntity(pizzaCriada.toString(), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity editar(@RequestParam("id")UUID id, @RequestBody PizzaDTO pizzaDTO) {
        this.pizzaService.editar(id, pizzaDTO);
        return new ResponseEntity("Editado com sucesso!", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity remover(@RequestParam("id")UUID id) {
        this.pizzaService.remover(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping
    public Set<Pizza> listar() {
        return this.pizzaService.listar();
    }

    @GetMapping("/findBy")
    public Pizza obter(@RequestParam("id")UUID id) {
        return this.pizzaService.obter(id);
    }
}