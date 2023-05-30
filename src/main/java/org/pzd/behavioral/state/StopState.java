package org.pzd.behavioral.state;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public class StopState implements State {

    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString() {
        return "Stop state";
    }
}
