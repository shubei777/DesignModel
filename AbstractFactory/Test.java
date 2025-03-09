package Model.AbstractFactory;

import Model.factory.Banana;

public class Test {
    public static void main(String[] args) {
        AFruitAndVegetables factory = (AFruitAndVegetables) XMLUtil.getBean();
        if (factory != null) {
            Fruit fruit = factory.CreateF();
            Vegetables vegetable = factory.CreateV();

            fruit.eat();
            vegetable.eat();
        } else {
            System.out.println("Factory creation failed.");
        }
    }
}
