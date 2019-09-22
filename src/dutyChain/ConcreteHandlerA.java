package dutyChain;

/**
 * @author zhy
 */
public class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("A".equals(request)) {
            System.out.println("具体处理者A负责处理该请求");
            return;
        }
        if (getNext() != null) {
            getNext().handleRequest(request);
            return;
        }
        System.out.println("没有人处理该请求");
    }
}
