package bridge;

/**
 * 红色正方形
 */
public class RedSquare implements Graph {

    @Override
    public void showColor() {
        System.out.println("颜色是红色");
    }

    @Override
    public void showShape() {
        System.out.println("形状是正方形");
    }
}
