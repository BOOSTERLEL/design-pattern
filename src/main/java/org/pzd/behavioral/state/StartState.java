package org.pzd.behavioral.state;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public class StartState implements State{

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }
    public String toString() {
        return "Start state";
    }
}
