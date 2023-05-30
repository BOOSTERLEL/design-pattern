package org.pzd.behavioral.memento;

import lombok.Getter;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
@Getter
public class Memento {
    private String state;

    public Memento(String state) {
        this.state = state;
    }
}
