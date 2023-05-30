package org.pzd.J2EE.serviceLocator;

/**
 * @author PENG_Zhengda
 * @date 2023/5/30
 * @apiNote
 */
public class ServiceLocatorTest {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
