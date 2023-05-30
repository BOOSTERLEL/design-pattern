package org.pzd.behavioral.template;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public class TemplateTest {
    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
