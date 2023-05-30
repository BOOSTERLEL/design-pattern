package org.pzd.creational.singletonPattern;

/**
 * @author PENG_Zhengda
 * @date 2023/5/24
 * @apiNote
 */
public class StarveLoading {
    private static StarveLoading instance=new StarveLoading();

    private StarveLoading() {
    }

    public static synchronized StarveLoading getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("starve loading");
    }
}
