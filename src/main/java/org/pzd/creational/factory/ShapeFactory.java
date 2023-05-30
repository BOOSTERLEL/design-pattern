package org.pzd.creational.factory;

/**
 * @author PENG_Zhengda
 * @date 2023/5/24
 * @apiNote
 */
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("circle")) {
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("square")) {
            return new Square();
        }
        if (shapeType.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}
