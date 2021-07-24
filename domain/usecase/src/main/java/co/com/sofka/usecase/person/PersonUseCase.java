package co.com.sofka.usecase.person;

import co.com.sofka.model.person.Person;
import co.com.sofka.model.person.gateways.PersonRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class PersonUseCase {

    private final PersonRepository repository;

    public Person crearPersona(Person person) {
        return repository.crearPersona(person);
    }
     public List<Person> listar(){
        return repository.listar();
     }
}
