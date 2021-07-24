package co.com.sofka.api;

import co.com.sofka.model.person.Person;
import co.com.sofka.usecase.person.PersonUseCase;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
public class ApiRest {

    private final PersonUseCase useCase;

    @PostMapping(path = "/crear")
    public Person commandName(@RequestBody Person person) {
        return useCase.crearPersona(person);
    }

    @GetMapping(path = "/list")
    public List<Person> listarPersona(){
        return useCase.listar();
    }
}
