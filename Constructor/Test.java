package Model.Constructor;

public class Test {
    public static void main(String[] args) {
        KFCWaiter waiter = new KFCWaiter();

        // 选择 A 套餐
        MealBuilder mealA = new SubMealBuilderA();
        waiter.setMealBuilder(mealA);
        Meal meal1 = waiter.construct();
        System.out.println(meal1);

        // 选择 B 套餐
        MealBuilder mealB = new SubMealBuilderB();
        waiter.setMealBuilder(mealB);
        Meal meal2 = waiter.construct();
        System.out.println(meal2);
    }
}
