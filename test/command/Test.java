package command;

import commad.Command;
import commad.ConcreteCommand;
import commad.Invoker;

public class Test {

    public static void main(String[] args) {
        Command cmd = new ConcreteCommand();
        Invoker invoker = new Invoker(cmd);
        System.out.println("客户访问调用者的call方法");
        invoker.call();
    }
}
