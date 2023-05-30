package org.pzd.behavioral.command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PENG_Zhengda
 * @date 2023/5/27
 * @apiNote
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
