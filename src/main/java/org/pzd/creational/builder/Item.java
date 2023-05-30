package org.pzd.creational.builder;

/**
 * @author PENG_Zhengda
 * @date 2023/5/25
 * @apiNote
 */
public interface Item {
    public String name();

    public Packing packing();

    public float price();
}
