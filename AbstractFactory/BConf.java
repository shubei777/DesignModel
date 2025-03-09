package Model.AbstractFactory;

import Model.AbstractFactory.Banana;

public class BConf implements BFruitAndVegetables {
    @Override
    public Banana CreateF() {
        return new Banana();
    }

    @Override
    public Vegetables CreateV() {
        return new Tomato();
    }
}
