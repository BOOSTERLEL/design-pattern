package org.pzd.creational.abstractFactory.object;

/**
 * @author PENG_Zhengda
 * @date 2023/5/24
 * @apiNote
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
