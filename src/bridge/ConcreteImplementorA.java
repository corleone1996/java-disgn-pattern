package bridge;

/**
 * @author zhy
 */
public class ConcreteImplementorA implements Implementor {
    @Override
    public void operationImpl() {
        System.out.println("具体实现化角色被访问");
    }
}
