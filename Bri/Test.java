package Model.Bri;

public class Test {
    public static void main(String a[]) {
        Color color;
        Pen pen;

        // 通过 XML 配置动态获取对象（反射机制）
        color = (Color) XMLUtilPen.getBean("color");
        pen = (Pen) XMLUtilPen.getBean("pen");

        // 设置颜色并绘制
        pen.setColor(color);
        pen.draw("鲜花");
    }

}
