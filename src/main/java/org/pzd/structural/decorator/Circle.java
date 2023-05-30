package org.pzd.structural.decorator;

/**
 * @author PENG_Zhengda
 * @date 2023/5/27
 * @apiNote
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
