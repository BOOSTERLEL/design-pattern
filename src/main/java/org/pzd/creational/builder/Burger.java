package org.pzd.creational.builder;

/**
 * @author PENG_Zhengda
 * @date 2023/5/25
 * @apiNote
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
