package org.pzd.structural.facade;

/**
 * @author PENG_Zhengda
 * @date 2023/5/27
 * @apiNote
 */
public class ShapeMaker {
    private Shape circle;

    public ShapeMaker() {
        circle = new Circle();
    }

    public void drawCircle() {
        circle.draw();
    }
}
