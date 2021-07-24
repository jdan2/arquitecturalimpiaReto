package co.com.sofka.model.person;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class Person {
    private String nombre;

    public Person() {
    }

    public Person(String nombre) {
        this.nombre = nombre;
    }
}
