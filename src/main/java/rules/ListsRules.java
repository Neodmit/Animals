package rules;

import parameters.Height;
import parameters.Type;
import parameters.Weight;

import java.util.List;

public class ListsRules {
    private List<Height> heights;
    private List<Weight> weights;
    private List<Type> types;

    public ListsRules(List<Height> heights, List<Weight> weights, List<Type> types) {
        this.heights = heights;
        this.weights = weights;
        this.types = types;
    }

    public List<Height> getHeights() {
        return heights;
    }

    public List<Weight> getWeights() {
        return weights;
    }

    public List<Type> getTypes() {
        return types;
    }
}
