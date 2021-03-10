package rules;

import com.google.gson.Gson;

import java.io.*;

public class GettingParameters {

    private static Gson gson = new Gson();
    private static RulesParameters params;

    public static RulesParameters gettingParametersFromFile(String fileName) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
        params = gson.fromJson(br, RulesParameters.class);
        br.close();
        return params;
    }
}
