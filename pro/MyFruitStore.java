package Model.pro;

import java.util.Hashtable;

public class MyFruitStore {
    private static Hashtable fruittable
            =new Hashtable<Integer,MyFruit>();

    public static void Add(Integer key,MyFruit fruit){
        fruittable.put(key,fruit);
    }

    public MyFruit Get(Integer key){
        MyFruit fruit=(MyFruit) fruittable.get(key);
        return (MyFruit) fruit.clone();
    }
}
