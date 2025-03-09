package Model.pro;

public class MyFruit implements Cloneable {
    protected String kind;

    public MyFruit() {
    }

    public MyFruit(String kind) {
        this.kind = kind;
    }

    public void Display(){
        System.out.println(kind);
    }

    public Object clone() {
        Object obj = null;
        try {
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return obj;
    }

    /**
     * 获取
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    /**
     * 设置
     * @param kind
     */
    public void setKind(String kind) {
        this.kind = kind;
    }

    public String toString() {
        return "MyFruit{kind = " + kind + "}";
    }
}
