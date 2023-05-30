package org.pzd.structural.flyweight;

import java.util.HashMap;

/**
 * @author PENG_Zhengda
 * @date 2023/5/27
 * @apiNote
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getShape(String color) {
        Circle circle = (Circle) circleMap.get(color);

        if (circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }
        return circle;
    }
}
