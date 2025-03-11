package Model.Com;

public class Main {
    public static void main(String[] args) {
        Plate plate = new Plate();

        Apple apple = new Apple();
        Banana banana = new Banana();
        Pear pear = new Pear();

        plate.add(apple);
        plate.add(banana);
        plate.add(pear);

        System.out.println("Eating from the plate:");
        plate.eat();

        plate.remove(banana);
        System.out.println("After removing banana:");
        plate.eat();
    }
}
