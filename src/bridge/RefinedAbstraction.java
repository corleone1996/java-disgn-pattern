package bridge;

/**
 * 扩展抽象化角色
 *
 * @author zhy
 */
public class RefinedAbstraction extends Abstraction {
    protected RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("扩展抽象化角色被访问");
        implementor.operationImpl();
    }
}
