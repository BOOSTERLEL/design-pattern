package org.pzd.creational.abstractFactory;

import org.pzd.creational.abstractFactory.object.Shape;

/**
 * @author PENG_Zhengda
 * @date 2023/5/24
 * @apiNote
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

        //获取形状为 Circle 的对象
        assert shapeFactory != null;
        Shape shape = shapeFactory.getShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape.draw();
    }
}
