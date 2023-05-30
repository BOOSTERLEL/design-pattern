package org.pzd.behavioral.template;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public abstract class Game {
    abstract void initialize();

    abstract void startGame();

    abstract void endGame();

    /**
     * 模板
     */
    public final void play() {
        //初始化游戏
        initialize();

        //开始游戏
        startGame();

        //结束游戏
        endGame();
    }
}
