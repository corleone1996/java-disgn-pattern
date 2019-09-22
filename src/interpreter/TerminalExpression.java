package interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * 终结符表达式
 *
 * @author zhy
 */
public class TerminalExpression implements Expression {

    private Set<String> set = new HashSet<>();

    public TerminalExpression(String[] data) {
        for (String str : data) {
            set.add(str);
        }
    }

    @Override
    public boolean interpret(String info) {
        return set.contains(info);
    }
}
