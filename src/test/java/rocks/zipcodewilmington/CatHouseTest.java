package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import javax.swing.plaf.InsetsUIResource;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


@Test
    public void testGetNumberOFCats(){
    String name = "Fido";
    Date birthDate = new Date();
    Cat animal = AnimalFactory.createCat(name, birthDate);
    CatHouse.clear();
    CatHouse.add(animal);
    Assert.assertEquals((int) CatHouse.getNumberOfCats(), 1);
}

@Test
    public void removeCatTest(){
    CatHouse.clear();
    Cat animal = AnimalFactory.createCat(null, null);
    CatHouse.add(animal);
    Assert.assertEquals((int)CatHouse.getNumberOfCats(),1);
    CatHouse.remove(animal);
    Assert.assertEquals((int)CatHouse.getNumberOfCats(), 0);
}

@Test
    public void getCatById(){
    CatHouse.clear();
    Cat animal = AnimalFactory.createCat(null,null);
    CatHouse.add(animal);
    Assert.assertEquals(CatHouse.getCatById(0),animal);
}

@Test
    public void getCatById1(){
    CatHouse.clear();
    Cat animal = AnimalFactory.createCat(null,null);
    CatHouse.add(animal);
    CatHouse.add(animal);
    CatHouse.add(animal);
    Assert.assertEquals((int)CatHouse.getNumberOfCats(),3);
}


}

