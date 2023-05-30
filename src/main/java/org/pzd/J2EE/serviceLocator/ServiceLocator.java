package org.pzd.J2EE.serviceLocator;

/**
 * @author PENG_Zhengda
 * @date 2023/5/30
 * @apiNote
 */
public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName) {

        Service service = cache.getService(jndiName);

        if (service != null) {
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service) context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}
