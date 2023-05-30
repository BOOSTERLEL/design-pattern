package org.pzd.behavioral.memento;

import lombok.Data;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
@Data
public class Originator {
    private String state;

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}
