package org.pzd.behavioral.nullObject;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public class CustomerFactory {
    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (String s : names) {
            if (s.equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
