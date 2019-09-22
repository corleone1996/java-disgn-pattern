package iterator;

/**
 * 抽象迭代器
 *
 * @author zhy
 */
public interface Iterator {

    Object first();

    Object next();

    boolean hasNext();
}
