package org.pzd.structural.decorator;

/**
 * @author PENG_Zhengda
 * @date 2023/5/27
 * @apiNote
 */
public class DecoratorTest {
    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        circle.draw();
        redCircle.draw();
    }
}
