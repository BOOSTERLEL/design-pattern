package org.pzd.structural.bridge;

/**
 * @author PENG_Zhengda
 * @date 2023/5/26
 * @apiNote
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
