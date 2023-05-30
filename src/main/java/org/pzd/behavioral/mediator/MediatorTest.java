package org.pzd.behavioral.mediator;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public class MediatorTest {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
