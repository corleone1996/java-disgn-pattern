package flyweight;

/**
 * 非享元角色
 *
 * @author zhy
 */
public class UnsharedConcreteFlyweight {

    private String info;

    UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
