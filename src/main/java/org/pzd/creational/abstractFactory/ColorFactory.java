package org.pzd.creational.abstractFactory;

import org.pzd.creational.abstractFactory.object.Color;
import org.pzd.creational.abstractFactory.object.Green;
import org.pzd.creational.abstractFactory.object.Red;
import org.pzd.creational.abstractFactory.object.Shape;

/**
 * @author PENG_Zhengda
 * @date 2023/5/24
 * @apiNote
 */
public class ColorFactory implements AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color == null) {
            return null;
        }
        if (color.equalsIgnoreCase("RED")) {
            return new Red();
        }
        if (color.equalsIgnoreCase("GREEN")) {
            return new Green();
        }
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
