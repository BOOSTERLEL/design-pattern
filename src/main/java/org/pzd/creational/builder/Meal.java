package org.pzd.creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PENG_Zhengda
 * @date 2023/5/25
 * @apiNote
 */
public class Meal {
    private final List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    public void showItems() {
        for (Item item : items) {
            System.out.println("Item:" + item.name());
            System.out.println("Packing:" + item.packing().pack());
            System.out.println("Price:" + item.price());
        }
    }
}
