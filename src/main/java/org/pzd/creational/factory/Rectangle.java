package org.pzd.creational.factory;

/**
 * @author PENG_Zhengda
 * @date 2023/5/24
 * @apiNote
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
