package org.pzd.J2EE.serviceLocator;

/**
 * @author PENG_Zhengda
 * @date 2023/5/30
 * @apiNote
 */
public class Service1 implements Service {
    @Override
    public void execute() {
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}
