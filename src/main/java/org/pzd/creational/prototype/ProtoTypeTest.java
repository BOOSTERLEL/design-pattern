package org.pzd.creational.prototype;

/**
 * @author PENG_Zhengda
 * @date 2023/5/26
 * @apiNote
 */
public class ProtoTypeTest {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape clonedShape = (Shape) ShapeCache.getShape("1");
        System.out.println("Shape: " + clonedShape.getType());
    }
}
