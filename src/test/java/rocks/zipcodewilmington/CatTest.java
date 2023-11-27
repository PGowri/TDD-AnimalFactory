package rocks.zipcodewilmington;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName()  {

        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String name  = "Fido";
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        cat.setName(name);
        Assert.assertEquals(name, cat.getName());
    }


    @Test
    public void setBirthDate() {
        Cat cat = new Cat(null,null, null);
        cat.setBirthDate(new Date(2022,1,10));

        Assert.assertEquals(cat.getBirthDate(), new Date(2022, 1, 10));
    }

    @Test
    public void testEat(){
        Cat cat = new Cat(null, null, null);
        cat.eat(new Food());
        Assert.assertEquals((int)cat.getNumberOfMealsEaten(),1);
    }

    @Test
    public void testGetId(){
        Cat cat = new Cat(null, null,2);
        Assert.assertEquals((int)cat.getId(), 2);
    }


        @Test
         public void speakTest() {
        Cat cat = new Cat(null, null,null);
        Assert.assertEquals(cat.speak(), "meow!");
        }

        @Test
        public void inheritanceTest1(){
        Cat cat = new Cat (null, null, null);
        Assert.assertTrue(cat instanceof Mammal);
        }

    @Test
    public void inheritanceTest2(){
        Cat cat = new Cat (null, null, null);
        Assert.assertTrue(cat instanceof Animal);
    }
    }

