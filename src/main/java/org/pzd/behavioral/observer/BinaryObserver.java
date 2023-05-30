package org.pzd.behavioral.observer;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public class BinaryObserver extends Observer {
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
