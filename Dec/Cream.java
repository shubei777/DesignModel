package Model.Dec;

public class Cream extends Decorating {
    public Cream(IBirthdayCake cake) {
        super(cake);
        System.out.println("Adding Cream to Cake.");
    }

    public String PutCream() {
        return " + Cream";
    }

    @Override
    public String Show() {
        return super.Show() + PutCream();
    }
}
