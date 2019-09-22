package mediator;

/**
 * @author zhy
 */
public class Test {

    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleagueA = new ConcreteColleagueA();
        Colleague colleagueB = new ConcreteColleagueB();
        mediator.register(colleagueA);
        mediator.register(colleagueB);
        colleagueA.send();
        System.out.println("-------------------------");
        colleagueB.send();
    }
}
