package co.com.sofka.mongo;

import co.com.sofka.model.person.Person;
import co.com.sofka.model.person.gateways.PersonRepository;
import co.com.sofka.mongo.helper.AdapterOperations;
import org.reactivecommons.utils.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonMongoRepositoryAdapter extends AdapterOperations<Person, Person, String, MongoDBRepository> implements PersonRepository
{

    public PersonMongoRepositoryAdapter(MongoDBRepository repository, ObjectMapper mapper) {
        /**
         *  Could be use mapper.mapBuilder if your domain model implement builder pattern
         *  super(repository, mapper, d -> mapper.mapBuilder(d,ObjectModel.ObjectModelBuilder.class).build());
         *  Or using mapper.map with the class of the object model
         */
        super(repository, mapper, d -> mapper.map(d, Person.class));
    }

    @Override
    public Person crearPersona(Person person) {
        return this.repository.save(person);
    }

    @Override
    public List<Person> listar() {
        return this.repository.findAll();
    }
}
