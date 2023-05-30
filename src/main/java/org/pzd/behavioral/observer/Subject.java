package org.pzd.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PENG_Zhengda
 * @date 2023/5/28
 * @apiNote
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;

    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update();
        }
    }
}
