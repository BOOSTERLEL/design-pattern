package org.pzd.structural.bridge;

/**
 * @author PENG_Zhengda
 * @date 2023/5/26
 * @apiNote
 */
public class bridgeTest {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, 100, 10, new RedCircle());
        redCircle.draw();
    }
}
