package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addTest() {
        // given
        Dog expected = new Dog();
        Integer id = expected.getId();

        // when
        DogHouse.add(expected);
        Dog actual = DogHouse.getDogById(id);

        // then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeTest() {
        // given
        Dog dogToBeAdded = new Dog(null, null, 0);
        DogHouse.add(dogToBeAdded);
        Integer id = dogToBeAdded.getId();

        // when
        DogHouse.remove(id);
        Dog retrievedDog = DogHouse.getDogById(id);

        // then
        Assert.assertNull(retrievedDog);
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest() {
        // given
        Dog dogToBeAdded = new Dog(null, null, 0);
        DogHouse.add(dogToBeAdded);
        Integer id = dogToBeAdded.getId();

        // when
        DogHouse.add(dogToBeAdded);
        Dog retrievedDog = DogHouse.getDogById(id);

        // then
        Assert.assertNotNull(retrievedDog);
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeByDogTest() {
        // given
        Dog dogToBeAdded = new Dog(null, null, 0);
        DogHouse.add(dogToBeAdded);
        Integer id = dogToBeAdded.getId();

        // when
        DogHouse.remove(dogToBeAdded);
        Cat retrievedCat = CatHouse.getCatById(id);

        // then
        Assert.assertNull(retrievedCat);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogsTest() {

        Dog dog = new Dog();
        int numberOfDogsBeforeAdd = DogHouse.getNumberOfDogs();
        int expected = numberOfDogsBeforeAdd + 1;
        DogHouse.add(dog);
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
