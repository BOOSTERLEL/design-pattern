package org.pzd.J2EE.serviceLocator;

/**
 * @author PENG_Zhengda
 * @date 2023/5/30
 * @apiNote
 */
public class InitialContext {
    public Object lookup(String jndiName) {
        if (jndiName.equalsIgnoreCase("SERVICE1")) {
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        } else if (jndiName.equalsIgnoreCase("SERVICE2")) {
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
}
