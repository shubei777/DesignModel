package Model.Constructor;

public class Meal {
    private String food;
    private String drink;

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getFood() {
        return food;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public String toString() {
        return "Meal: Food = " + food + ", Drink = " + drink;
    }
}
