package org.pzd.creational.prototype;

/**
 * @author PENG_Zhengda
 * @date 2023/5/26
 * @apiNote
 */
public class Square extends Shape {
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
