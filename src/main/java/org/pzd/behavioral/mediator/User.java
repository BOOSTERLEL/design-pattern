package org.pzd.behavioral.mediator;

import lombok.Data;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
@Data
public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
