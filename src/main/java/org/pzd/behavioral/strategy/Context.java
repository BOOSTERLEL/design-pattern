package org.pzd.behavioral.strategy;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
