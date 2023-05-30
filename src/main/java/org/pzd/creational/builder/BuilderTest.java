package org.pzd.creational.builder;

/**
 * @author PENG_Zhengda
 * @date 2023/5/25
 * @apiNote
 */
public class BuilderTest {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal beefMeal = mealBuilder.prepareBeefMeal();
        beefMeal.showItems();
        System.out.println("Total cost:" + beefMeal.getCost());
    }
}
