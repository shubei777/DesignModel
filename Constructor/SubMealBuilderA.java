package Model.Constructor;

public class SubMealBuilderA extends MealBuilder {
    @Override
    public void buildFood() {
        meal.setFood("Burger");
    }

    @Override
    public void buildDrink() {
        meal.setDrink("Coke");
    }
}
