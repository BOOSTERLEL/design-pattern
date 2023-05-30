package org.pzd.structural.bridge;

/**
 * @author PENG_Zhengda
 * @date 2023/5/26
 * @apiNote
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
