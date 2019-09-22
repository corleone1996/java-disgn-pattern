package dutyChain;

/**
 * @author zhy
 */
public class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(String request) {
        if ("B".equals(request)) {
            System.out.println("具体处理者B处理该请求");
            return;
        }
        if (getNext() != null) {
            getNext().handleRequest(request);
            return;
        }
        System.out.println("没有人处理该请求");
    }
}
