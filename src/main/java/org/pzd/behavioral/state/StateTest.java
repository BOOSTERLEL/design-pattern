package org.pzd.behavioral.state;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public class StateTest {
    public static void main(String[] args) {
        Context ctx = new Context();

        StartState startState = new StartState();
        startState.doAction(ctx);

        System.out.println(ctx.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(ctx);

        System.out.println(ctx.getState().toString());
    }
}
