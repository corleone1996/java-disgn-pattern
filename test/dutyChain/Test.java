package dutyChain;

/**
 * @author zhy
 */
public class Test {

    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        handlerA.setNext(handlerB);
        handlerA.handleRequest("A");
        System.out.println("------------------");
        handlerA.handleRequest("B");
    }
}
