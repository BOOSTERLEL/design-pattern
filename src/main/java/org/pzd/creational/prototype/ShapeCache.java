package org.pzd.creational.prototype;

import java.util.Hashtable;

/**
 * @author PENG_Zhengda
 * @date 2023/5/26
 * @apiNote
 */
public class ShapeCache {
    private static final Hashtable<String, Shape> shapeMap = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Square square = new Square();
        square.setId("1");
        shapeMap.put(square.getId(), square);
    }
}
