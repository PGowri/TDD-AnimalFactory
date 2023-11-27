package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

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
        Assert.assertEquals((int) DogHouse.getNumberOfDogs(), 1);
    }

    @Test
    public void removeTest(){
        DogHouse.clear();
        Dog animal = AnimalFactory.createDog(null, null);
        DogHouse.add(animal);
        Assert.assertEquals((int)DogHouse.getNumberOfDogs(), 1);
        DogHouse.remove(0);
        Assert.assertEquals((int)DogHouse.getNumberOfDogs(), 0);
    }

    @Test
    public void removeDogTest(){
        DogHouse.clear();
        Dog animal = AnimalFactory.createDog(null,null);
        DogHouse.add(animal);
        Assert.assertEquals((int)DogHouse.getNumberOfDogs(), 1);
        DogHouse.remove(animal);
        Assert.assertEquals((int)DogHouse.getNumberOfDogs(),0);
    }
    @Test
    public void getDogById(){
        DogHouse.clear();
        Dog animal = AnimalFactory.createDog(null, null);
        DogHouse.add(animal);
        Assert.assertEquals(DogHouse.getDogById(0),animal);
    }
    @Test
    public void getDogById1(){
        DogHouse.clear();
        Dog animal = AnimalFactory.createDog(null,null);
        DogHouse.add(animal);
        DogHouse.add(animal);
        DogHouse.add(animal);
        Assert.assertEquals((int) DogHouse.getNumberOfDogs(),3);
    }

}
