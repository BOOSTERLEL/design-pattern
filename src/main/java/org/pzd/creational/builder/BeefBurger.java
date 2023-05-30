package org.pzd.creational.builder;

/**
 * @author PENG_Zhengda
 * @date 2023/5/25
 * @apiNote
 */
public class BeefBurger extends Burger {
    @Override
    public String name() {
        return "Beef burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
