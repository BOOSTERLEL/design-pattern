package org.pzd.structural.bridge;

/**
 * @author PENG_Zhengda
 * @date 2023/5/26
 * @apiNote
 */
public class Circle extends Shape {
    private final int x;
    private final int y;
    private final int radius;

    public Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
