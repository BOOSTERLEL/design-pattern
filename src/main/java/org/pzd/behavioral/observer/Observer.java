package org.pzd.behavioral.observer;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
