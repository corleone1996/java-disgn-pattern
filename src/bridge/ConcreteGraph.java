package bridge;

import bridge.color.Color;
import bridge.shape.Shape;

/**
 * 具体图形
 */
public class ConcreteGraph implements Graph {

    /**
     * 颜色
     */
    private Color color;
    /**
     * 形状
     */
    private Shape shape;

    /**
     * 构造器
     *
     * @param color 颜色
     * @param shape 形状
     */
    public ConcreteGraph(Color color, Shape shape) {
        this.color = color;
        this.shape = shape;
    }

    @Override
    public void showColor() {
        color.showColor();
    }

    @Override
    public void showShape() {
        shape.showShape();
    }
}
