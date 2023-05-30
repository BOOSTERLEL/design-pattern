package org.pzd.creational.singletonPattern;

/**
 * @author PENG_Zhengda
 * @date 2023/5/24
 * @apiNote
 */
public class LazyLoading {
    private static LazyLoading instance;

    private LazyLoading() {
    }

    public static synchronized LazyLoading getInstance() {
        if (instance == null) {
            instance = new LazyLoading();
        }
        return instance;
    }

    public void message() {
        System.out.println("lazy loading");
    }
}
