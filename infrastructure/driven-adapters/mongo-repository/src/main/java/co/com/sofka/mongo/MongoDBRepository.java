package co.com.sofka.mongo;

import co.com.sofka.model.person.Person;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface MongoDBRepository extends MongoRepository<Person, String> , QueryByExampleExecutor<Person> {
}
