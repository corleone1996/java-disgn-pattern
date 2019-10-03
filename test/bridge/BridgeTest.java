package bridge;

import bridge.color.Color;
import bridge.color.Red;
import bridge.shape.Shape;
import bridge.shape.Square;

/**
 * 桥接模式测试
 */
public class BridgeTest {

    public static void main(String[] args) {
        System.out.println("==非桥接模式生成图形==");
        Graph redSquare1 = new RedSquare();
        redSquare1.showColor();
        redSquare1.showShape();

        System.out.println("==桥接模式生成图形==");
        Color red = new Red();
        Shape square = new Square();
        Graph redSquare = new ConcreteGraph(red, square);
        redSquare.showColor();
        redSquare.showShape();
    }
}
