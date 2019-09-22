package interpreter;

/**
 * @author zhy
 */
public class AndExpression implements Expression {

    private Expression city;

    private Expression person;

    public AndExpression(Expression city, Expression person) {
        this.city = city;
        this.person = person;
    }

    @Override
    public boolean interpret(String info) {
        String[] splitInfo = info.split("的");
        return city.interpret(splitInfo[0]) &&
                person.interpret(splitInfo[1]);
    }
}
