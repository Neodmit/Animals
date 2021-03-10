import animals.GettingAnimals;
import org.junit.Test;
import rules.GettingParameters;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class TestCountingAnimalsAccordingRules {
    String animalsFile = "C:\\Users\\Dima\\ForNeolab\\src\\main\\java\\resources\\animals";

    @Test
    public void countingHerbivores() throws IOException {
        String paramsFile = "C:\\Users\\Dima\\ForNeolab\\src\\main\\java\\resources\\rules\\herbivores";
        assertEquals(2, Filtering.countingAnimals(GettingAnimals.gettingAnimalsFromFile(animalsFile), GettingParameters.gettingParametersFromFile(paramsFile)));
    }

    @Test
    public void countingHerbivoresOrCarnivoresSmall() throws IOException {
        String paramsFile = "C:\\Users\\Dima\\ForNeolab\\src\\main\\java\\resources\\rules\\herbivoresOrCarnivoresSmall";
        assertEquals(2, Filtering.countingAnimals(GettingAnimals.gettingAnimalsFromFile(animalsFile), GettingParameters.gettingParametersFromFile(paramsFile)));
    }

    @Test
    public void countingOmnivoresNotTall() throws IOException {
        String paramsFile = "C:\\Users\\Dima\\ForNeolab\\src\\main\\java\\resources\\rules\\OmnivoresNotTall";
        assertEquals(1, Filtering.countingAnimals(GettingAnimals.gettingAnimalsFromFile(animalsFile), GettingParameters.gettingParametersFromFile(paramsFile)));
    }
}
