package Model.pro;

public class ClientClass {
    public static void main(String[] args) {
        MyFruit fru1 = new Apple();
        MyFruit fru2 = (Apple)fru1.clone();

        fru1.Display();
        fru2.Display();

        System.out.println("fru1:"+fru1.hashCode());
        System.out.println("fru2:"+fru2.hashCode());
        System.out.println(fru1==fru2);
    }
}
