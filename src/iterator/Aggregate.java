package iterator;

/**
 * 抽象聚合
 *
 * @author zhy
 */
public interface Aggregate {

    void add(Object obj);

    void remove(Object obj);

    Iterator getIterator();
}
