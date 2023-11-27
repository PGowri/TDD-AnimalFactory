package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void speakTest() {
        Dog dog = new Dog(null, null,null );
        Assert.assertEquals(dog.speak(), "bark!");
    }

    @Test
    public void setBirthDate(){
        Dog dog = new Dog(null, null,null );
        dog.setBirthDate(new Date(2022,1,3));
        Assert.assertEquals(dog.getBirthDate(),new Date(2022, 1, 3));
    }
   @Test
    public void eatTest(){
       Dog dog = new Dog(null, null,null );
        dog.eat(new Food());
        Assert.assertEquals((int)dog.getNumberOfMealsEaten(), 1);
   }

    @Test
    public void getIdTest(){
        Dog dog = new Dog(null,null,45);
        Assert.assertEquals((int)dog.getId(), 45);
    }
    @Test
    public void inheritanceTest1(){
        Dog dog = new Dog(null,null,null);
        Assert.assertTrue(dog instanceof Mammal);
    }
    @Test
    public void inheritanceTest2(){
        Dog dog = new Dog(null,null,null);
        Assert.assertTrue(dog instanceof Animal);
    }
}

