package org.pzd.behavioral.template;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public class Football extends Game {
    @Override
    void endGame() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startGame() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
