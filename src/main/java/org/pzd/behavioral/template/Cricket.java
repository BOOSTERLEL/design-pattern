package org.pzd.behavioral.template;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public class Cricket extends Game {
    @Override
    void endGame() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startGame() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
