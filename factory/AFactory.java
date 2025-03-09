package Model.factory;

public class AFactory extends Factory{
    @Override
    public Fruit CreateFruit() {
        return new Apple();
    }
}
