import org.junit.Test;
import parameters.Height;
import parameters.Type;
import rules.GettingParameters;
import rules.ListsRules;
import rules.RulesParameters;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestGettingParameters {

    @Test
    public void gettingHerbivoresParameters() throws FileNotFoundException {
        String paramsFile = "C:\\Users\\Dima\\ForNeolab\\src\\main\\java\\resources\\rules\\herbivores";
        List<Type> incType = new ArrayList<>();
        incType.add(Type.HERBIVORE);
        ListsRules incRules = new ListsRules(null, null, incType);
        String description = "Количество травоядных: ";
        RulesParameters params = new RulesParameters(incRules, null, description);
        assertAll(
                () -> assertEquals(params.getIncludeParams().getTypes(), GettingParameters.gettingParametersFromFile(paramsFile).getIncludeParams().getTypes()),
                () -> assertEquals(params.getIncludeParams().getHeights(), GettingParameters.gettingParametersFromFile(paramsFile).getIncludeParams().getHeights()),
                () -> assertEquals(params.getIncludeParams().getWeights(), GettingParameters.gettingParametersFromFile(paramsFile).getIncludeParams().getWeights()),
                () -> assertEquals(params.getExcludeParams(), GettingParameters.gettingParametersFromFile(paramsFile).getExcludeParams()),
                () -> assertEquals(params.getDescription(), GettingParameters.gettingParametersFromFile(paramsFile).getDescription())
        );
    }

    @Test
    public void gettingHerbivoresOrCarnivoresSmallParameters() throws FileNotFoundException {
        String paramsFile = "C:\\Users\\Dima\\ForNeolab\\src\\main\\java\\resources\\rules\\herbivoresOrCarnivoresSmall";
        List<Type> incType = new ArrayList<>();
        List<Height> incHeight = new ArrayList<>();
        incType.add(Type.HERBIVORE);
        incType.add(Type.CARNIVORE);
        incHeight.add(Height.SMALL);
        ListsRules incRules = new ListsRules(incHeight, null, incType);
        String description = "Травоядные или платоядные, маленькие: ";
        RulesParameters params = new RulesParameters(incRules, null, description);
        assertAll(
                () -> assertEquals(params.getIncludeParams().getTypes(), GettingParameters.gettingParametersFromFile(paramsFile).getIncludeParams().getTypes()),
                () -> assertEquals(params.getIncludeParams().getHeights(), GettingParameters.gettingParametersFromFile(paramsFile).getIncludeParams().getHeights()),
                () -> assertEquals(params.getIncludeParams().getWeights(), GettingParameters.gettingParametersFromFile(paramsFile).getIncludeParams().getWeights()),
                () -> assertEquals(params.getExcludeParams(), GettingParameters.gettingParametersFromFile(paramsFile).getExcludeParams()),
                () -> assertEquals(params.getDescription(), GettingParameters.gettingParametersFromFile(paramsFile).getDescription())
        );
    }

    @Test
    public void gettingOmnivoresNotTallParameters() throws FileNotFoundException {
        String paramsFile = "C:\\Users\\Dima\\ForNeolab\\src\\main\\java\\resources\\rules\\OmnivoresNotTall";
        List<Type> incType = new ArrayList<>();
        List<Height> excHeight = new ArrayList<>();
        incType.add(Type.OMNIVORE);
        excHeight.add(Height.TALL);
        ListsRules incRules = new ListsRules(null, null, incType);
        ListsRules excRules = new ListsRules(excHeight, null, null);
        String description = "Всеядные не высокие: ";
        RulesParameters params = new RulesParameters(incRules, excRules, description);
        assertAll(
                () -> assertEquals(params.getIncludeParams().getTypes(), GettingParameters.gettingParametersFromFile(paramsFile).getIncludeParams().getTypes()),
                () -> assertEquals(params.getIncludeParams().getHeights(), GettingParameters.gettingParametersFromFile(paramsFile).getIncludeParams().getHeights()),
                () -> assertEquals(params.getIncludeParams().getWeights(), GettingParameters.gettingParametersFromFile(paramsFile).getIncludeParams().getWeights()),
                () -> assertEquals(params.getExcludeParams().getTypes(), GettingParameters.gettingParametersFromFile(paramsFile).getExcludeParams().getTypes()),
                () -> assertEquals(params.getExcludeParams().getWeights(), GettingParameters.gettingParametersFromFile(paramsFile).getExcludeParams().getWeights()),
                () -> assertEquals(params.getExcludeParams().getHeights(), GettingParameters.gettingParametersFromFile(paramsFile).getExcludeParams().getHeights()),
                () -> assertEquals(params.getDescription(), GettingParameters.gettingParametersFromFile(paramsFile).getDescription())
        );
    }
}
