package org.pzd.creational.abstractFactory;

import org.pzd.creational.abstractFactory.object.*;

/**
 * @author PENG_Zhengda
 * @date 2023/5/24
 * @apiNote
 */
public class ShapeFactory implements AbstractFactory {
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
