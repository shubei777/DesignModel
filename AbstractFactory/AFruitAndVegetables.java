package Model.AbstractFactory;

import Model.factory.Banana;

public interface AFruitAndVegetables {
    Apple CreateF();
    Vegetables CreateV();
}
