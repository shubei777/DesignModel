package Model.Dec;

public class Fruit extends Decorating {
    public Fruit(IBirthdayCake cake) {
        super(cake);
        System.out.println("Adding Fruit to Cake.");
    }

    public String PutFruit() {
        return " + Fruit";
    }

    @Override
    public String Show() {
        return super.Show() + PutFruit();
    }
}
