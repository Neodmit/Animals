import animals.Animal;
import animals.GettingAnimals;
import org.junit.Test;
import parameters.Height;
import parameters.Type;
import parameters.Weight;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.*;

public class TestGettingAnimals {
    String animalsFile = "C:\\Users\\Dima\\Animals\\src\\main\\java\\resources\\animals";

    @Test
    public void testGettingFirstAnimal() throws FileNotFoundException {
        Animal animal = new Animal(Height.SMALL, Weight.LIGHT, Type.HERBIVORE);
        assertAll(
                () -> assertEquals(animal.getHeight(), GettingAnimals.gettingAnimalsFromFile(animalsFile)[0].getHeight()),
                () -> assertEquals(animal.getType(), GettingAnimals.gettingAnimalsFromFile(animalsFile)[0].getType()),
                () -> assertEquals(animal.getWeight(), GettingAnimals.gettingAnimalsFromFile(animalsFile)[0].getWeight())
        );
    }

    @Test
    public void testGettingSecondAnimal() throws FileNotFoundException {
        Animal animal = new Animal(Height.SMALL, Weight.LIGHT, Type.CARNIVORE);
        assertAll(
                () -> assertEquals(animal.getHeight(), GettingAnimals.gettingAnimalsFromFile(animalsFile)[1].getHeight()),
                () -> assertEquals(animal.getType(), GettingAnimals.gettingAnimalsFromFile(animalsFile)[1].getType()),
                () -> assertEquals(animal.getWeight(), GettingAnimals.gettingAnimalsFromFile(animalsFile)[1].getWeight())
        );
    }

    @Test
    public void testGettingThirdAnimal() throws FileNotFoundException {
        Animal animal = new Animal(Height.TALL, Weight.LIGHT, Type.HERBIVORE);
        assertAll(
                () -> assertEquals(animal.getHeight(), GettingAnimals.gettingAnimalsFromFile(animalsFile)[2].getHeight()),
                () -> assertEquals(animal.getType(), GettingAnimals.gettingAnimalsFromFile(animalsFile)[2].getType()),
                () -> assertEquals(animal.getWeight(), GettingAnimals.gettingAnimalsFromFile(animalsFile)[2].getWeight())
        );
    }

    @Test
    public void testGettingFourthAnimal() throws FileNotFoundException {
        Animal animal = new Animal(Height.AVERAGE, Weight.LIGHT, Type.CARNIVORE);
        assertAll(
                () -> assertEquals(animal.getHeight(), GettingAnimals.gettingAnimalsFromFile(animalsFile)[3].getHeight()),
                () -> assertEquals(animal.getType(), GettingAnimals.gettingAnimalsFromFile(animalsFile)[3].getType()),
                () -> assertEquals(animal.getWeight(), GettingAnimals.gettingAnimalsFromFile(animalsFile)[3].getWeight())
        );
    }

    @Test
    public void testGettingFifthAnimal() throws FileNotFoundException {
        Animal animal = new Animal(Height.TALL, Weight.LIGHT, Type.OMNIVORE);
        assertAll(
                () -> assertEquals(animal.getHeight(), GettingAnimals.gettingAnimalsFromFile(animalsFile)[4].getHeight()),
                () -> assertEquals(animal.getType(), GettingAnimals.gettingAnimalsFromFile(animalsFile)[4].getType()),
                () -> assertEquals(animal.getWeight(), GettingAnimals.gettingAnimalsFromFile(animalsFile)[4].getWeight())
        );
    }

    @Test
    public void testGettingSixthAnimal() throws FileNotFoundException {
        Animal animal = new Animal(Height.AVERAGE, Weight.LIGHT, Type.OMNIVORE);
        assertAll(
                () -> assertEquals(animal.getHeight(), GettingAnimals.gettingAnimalsFromFile(animalsFile)[5].getHeight()),
                () -> assertEquals(animal.getType(), GettingAnimals.gettingAnimalsFromFile(animalsFile)[5].getType()),
                () -> assertEquals(animal.getWeight(), GettingAnimals.gettingAnimalsFromFile(animalsFile)[5].getWeight())
        );
    }
}
