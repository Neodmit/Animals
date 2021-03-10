package animals;

import parameters.Height;
import parameters.Type;
import parameters.Weight;

public class Animal {
    private Height height;
    private Weight weight;
    private Type type;

    public Animal(Height height, Weight weight, Type type) {
        this.height = height;
        this.weight = weight;
        this.type = type;
    }

    public Height getHeight() {
        return height;
    }

    public Weight getWeight() {
        return weight;
    }

    public Type getType() {
        return type;
    }
}
