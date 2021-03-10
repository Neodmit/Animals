package animals;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;


public class GettingAnimals {
    public static Type animalsArrayType = new TypeToken<Animal[]>() {}.getType();
    public static Gson gson = new Gson();

    public static Animal[] gettingAnimalsFromFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
        Animal[] animals = gson.fromJson(br, animalsArrayType);
        br.close();
        return animals;
    }
}
