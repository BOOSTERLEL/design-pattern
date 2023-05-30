package org.pzd.creational.abstractFactory;

/**
 * @author PENG_Zhengda
 * @date 2023/5/24
 * @apiNote
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("SHAPE")) {
            return new ShapeFactory();
        }
        if (choice.equalsIgnoreCase("COLOR")) {
            return new ColorFactory();
        }
        return null;
    }
}
