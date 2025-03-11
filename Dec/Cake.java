package Model.Dec;

public class Cake implements IBirthdayCake {
    public Cake() {
        System.out.println("A cake is created.");
    }

    @Override
    public String Show() {
        return "Basic Cake";
    }
}
