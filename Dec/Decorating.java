package Model.Dec;

public abstract class Decorating implements IBirthdayCake {
    protected IBirthdayCake cake;

    public Decorating(IBirthdayCake cake) {
        this.cake = cake;
    }

    @Override
    public String Show() {
        return cake.Show();
    }
}
