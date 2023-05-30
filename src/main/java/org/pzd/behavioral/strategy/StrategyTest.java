package org.pzd.behavioral.strategy;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public class StrategyTest {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationSub());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

        context = new Context(new OperationMul());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
}
