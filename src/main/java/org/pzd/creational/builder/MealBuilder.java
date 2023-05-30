package org.pzd.creational.builder;

/**
 * @author PENG_Zhengda
 * @date 2023/5/25
 * @apiNote
 */
public class MealBuilder {
    public Meal prepareBeefMeal() {
        Meal meal = new Meal();
        meal.addItem(new BeefBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
