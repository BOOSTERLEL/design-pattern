package org.pzd.behavioral.observer;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public class ObserverTest {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
