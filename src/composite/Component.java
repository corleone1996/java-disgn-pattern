package composite;

/**
 * 抽象构件
 *
 * @author zhy
 */
public interface Component {

    void add(Component component);

    void remove(Component component);

    Component getChild(int i);

    void operation();
}
