package Model.Dec;

public class Main {
    public static void main(String[] args) {
        IBirthdayCake cake = new Cake();
        System.out.println("Cake Description: " + cake.Show());

        // 添加水果
        cake = new Fruit(cake);
        System.out.println("Cake Description: " + cake.Show());

        // 添加奶油
        cake = new Cream(cake);
        System.out.println("Cake Description: " + cake.Show());
    }
}
