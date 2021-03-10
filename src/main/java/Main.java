import animals.GettingAnimals;
import rules.GettingParameters;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {
        System.out.println(GettingParameters.gettingParametersFromFile(args[1]).getDescription() + Filtering.countingAnimals(GettingAnimals.gettingAnimalsFromFile(args[0]), GettingParameters.gettingParametersFromFile(args[1])));
        System.out.println(GettingParameters.gettingParametersFromFile(args[2]).getDescription() + Filtering.countingAnimals(GettingAnimals.gettingAnimalsFromFile(args[0]), GettingParameters.gettingParametersFromFile(args[2])));
        System.out.println(GettingParameters.gettingParametersFromFile(args[3]).getDescription() + Filtering.countingAnimals(GettingAnimals.gettingAnimalsFromFile(args[0]), GettingParameters.gettingParametersFromFile(args[3])));
    }
}
