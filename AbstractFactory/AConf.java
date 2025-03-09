package Model.AbstractFactory;

import Model.factory.Banana;

public class AConf implements AFruitAndVegetables {
    @Override
    public Apple CreateF() {
        return new Apple();
    }

    @Override
    public Vegetables CreateV() {
        return new Cabbage();
    }
}
