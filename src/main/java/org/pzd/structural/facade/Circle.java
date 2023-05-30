package org.pzd.structural.facade;

/**
 * @author PENG_Zhengda
 * @date 2023/5/27
 * @apiNote
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
