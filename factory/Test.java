package Model.factory;

public class Test {
    public static void main(String[] args) {
//        Factory factory=new AFactory();
         Factory factory = (Factory)XMLUtil.getBean();
        Fruit fruit=factory.CreateFruit();
        fruit.eat();
    }
}
