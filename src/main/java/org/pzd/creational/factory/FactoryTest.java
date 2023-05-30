package org.pzd.creational.factory;

/**
 * @author PENG_Zhengda
 * @date 2023/5/24
 * @apiNote
 */
public class FactoryTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();
    }
}
