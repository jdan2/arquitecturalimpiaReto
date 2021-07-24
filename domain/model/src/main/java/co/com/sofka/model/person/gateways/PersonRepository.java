package co.com.sofka.model.person.gateways;

import co.com.sofka.model.person.Person;

import java.util.List;

public interface PersonRepository {

    Person crearPersona(Person person);
    List<Person> listar();
}
