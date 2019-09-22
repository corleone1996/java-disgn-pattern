package mediator;

/**
 * 具体同事类B
 *
 * @author zhy
 */
public class ConcreteColleagueB extends Colleague {
    @Override
    public void receive() {
        System.out.println("具体同事类B接到请求");
    }

    @Override
    public void send() {
        System.out.println("具体同事类B发送请求");
        mediator.relay(this);
    }
}
