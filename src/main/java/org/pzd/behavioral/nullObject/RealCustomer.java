package org.pzd.behavioral.nullObject;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public class RealCustomer extends AbstractCustomer {
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
