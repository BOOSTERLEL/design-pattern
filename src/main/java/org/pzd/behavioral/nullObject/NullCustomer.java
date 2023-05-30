package org.pzd.behavioral.nullObject;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return true;
    }

    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }
}
