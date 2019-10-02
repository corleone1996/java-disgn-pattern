package bridge;

import bridge.color.Color;
import bridge.shape.Shape;

/**
 * 图形抽象
 */
public abstract class AbstractGraph {

    /**
     * 颜色
     */
    protected Color color;
    /**
     * 形状
     */
    protected Shape shape;

    /**
     * 构造器
     *
     * @param color 颜色
     * @param shape 形状
     */
    protected AbstractGraph(Color color, Shape shape) {
        this.color = color;
        this.shape = shape;
    }

    /**
     * 展示颜色抽象方法
     */
    public abstract void showColor();

    /**
     * 展示形状抽象方法
     */
    public abstract void showShape();
}
