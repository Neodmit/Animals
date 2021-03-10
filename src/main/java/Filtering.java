import animals.Animal;
import parameters.Height;
import parameters.Type;
import parameters.Weight;
import rules.RulesParameters;

public class Filtering {

    public static int countingAnimals(Animal[] animals, RulesParameters parameters) {
        int numFilteredAnimals = 0;
        boolean flag;
        for (Animal animal : animals) {
            flag = false;
            if (parameters.getIncludeParams() != null) {
                if (parameters.getIncludeParams().getTypes() != null) {
                    for (Type type : parameters.getIncludeParams().getTypes()) {
                        if (animal.getType() == type) {
                            flag = true;
                            break;
                        } else flag = false;
                    }
                    if (!flag) continue;
                }
                if (parameters.getIncludeParams().getHeights() != null) {
                    for (Height height : parameters.getIncludeParams().getHeights()) {
                        if (animal.getHeight() == height) {
                            flag = true;
                            break;
                        } else flag = false;
                    }
                    if (!flag) continue;
                }
                if (parameters.getIncludeParams().getWeights() != null) {
                    for (Weight weight : parameters.getIncludeParams().getWeights()) {
                        if (animal.getWeight() == weight) {
                            flag = true;
                            break;
                        } else flag = false;
                    }
                    if (!flag) continue;
                }
            }

            if (parameters.getExcludeParams() != null) {
                if (parameters.getExcludeParams().getTypes() != null) {
                    for (Type type : parameters.getExcludeParams().getTypes()) {
                        if (animal.getType() != type) {
                            flag = true;
                            break;
                        } else flag = false;
                    }
                    if (!flag) continue;
                }
                if (parameters.getExcludeParams().getHeights() != null) {
                    for (Height height : parameters.getExcludeParams().getHeights()) {
                        if (animal.getHeight() != height) {
                            flag = true;
                            break;
                        } else flag = false;
                    }
                    if (!flag) continue;
                }
                if (parameters.getExcludeParams().getWeights() != null) {
                    for (Weight weight : parameters.getExcludeParams().getWeights()) {
                        if (animal.getWeight() != weight) {
                            flag = true;
                            break;
                        } else flag = false;
                    }
                    if (!flag) continue;
                }
            }
            if (flag) numFilteredAnimals++;
        }
        return numFilteredAnimals;
    }
}
