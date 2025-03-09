package Model.Constructor;

public class SubMealBuilderB extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("Pizza");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Juice");
    }
}
