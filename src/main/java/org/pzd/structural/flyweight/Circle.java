package org.pzd.structural.flyweight;

import lombok.Setter;

/**
 * @author PENG_Zhengda
 * @date 2023/5/27
 * @apiNote
 */
@Setter
public class Circle implements Shape {
    private String color;
    private int x;
    private int y;
    private int radius;

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
    }
}
