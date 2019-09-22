package interpreter;

/**
 * 抽象表达式
 *
 * @author zhy
 */
public interface Expression {

    boolean interpret(String info);
}
