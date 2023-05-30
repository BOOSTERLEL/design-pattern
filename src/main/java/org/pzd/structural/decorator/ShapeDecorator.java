package org.pzd.structural.decorator;

/**
 * @author PENG_Zhengda
 * @date 2023/5/27
 * @apiNote
 */
public abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
