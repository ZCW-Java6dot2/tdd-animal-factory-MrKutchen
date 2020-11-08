package rocks.zipcodewilmington.animals;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class Dog extends Mammal {

    public Dog() {
        super(null, null, 1);
    }
    public Dog(String name, Date birthDate, Integer id) {
        super(name, birthDate, id);
    }

    public Dog(Integer id, String name) {
        super(id, name);
    }

    public Dog(Date birthDate) {
        super(birthDate);
    }

    public Dog(String givenName) {
        super(givenName);
    }

    public Dog(Integer id) {
        super(id);
    }

    public String speak() {

        return "bark!";
    }
}
