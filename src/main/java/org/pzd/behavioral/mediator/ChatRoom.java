package org.pzd.behavioral.mediator;

import java.util.Date;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public class ChatRoom {
    public static void showMessage(User user, String message) {
        System.out.println(new Date() + " [" + user.getName() + "] : " + message);
    }

}
