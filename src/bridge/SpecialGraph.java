package bridge;

import bridge.color.Color;
import bridge.shape.Shape;

/**
 * 特殊图形
 */
public class SpecialGraph extends AbstractGraph {

    public SpecialGraph(Color color, Shape shape) {
        super(color, shape);
        System.out.println("干点什么");
    }

    @Override
    public void showColor() {
        System.out.println("还干点什么");
        color.showColor();
    }

    @Override
    public void showShape() {
        System.out.println("再干点什么");
        shape.showShape();
    }
}
