package Model.Bri;

public class BridgePatternDemo {
    public static void main(String[] args) {
        Pen pen = new SmallPen();
        pen.setColor(new Red());
        pen.draw("花");

        pen.setColor(new Blue());
        pen.draw("房子");

    }
}