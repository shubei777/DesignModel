package Model.factory;

public class BFactory extends Factory{
    @Override
    public Fruit CreateFruit() {
        return new Banana();
    }
}
