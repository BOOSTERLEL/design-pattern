package org.pzd.creational.abstractFactory;

import org.pzd.creational.abstractFactory.object.Color;
import org.pzd.creational.abstractFactory.object.Shape;

/**
 * @author PENG_Zhengda
 * @date 2023/5/24
 * @apiNote
 */
public interface AbstractFactory {
    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);
}
