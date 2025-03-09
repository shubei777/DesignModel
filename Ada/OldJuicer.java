package Model.Ada;

import Model.pro.MyFruit;

public class OldJuicer {
    public String onePort(MyFruit fruit){
        String str=fruit.getKind()+"果汁";
        return str;
    }
}
