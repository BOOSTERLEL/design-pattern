package org.pzd.creational.singletonPattern;

/**
 * @author PENG_Zhengda
 * @date 2023/5/24
 * @apiNote 双检锁/双重校验锁
 */
public class DCL {
    private volatile static DCL instance;

    private DCL() {
    }

    public static DCL getInstance() {
        if (instance == null) {
            synchronized (DCL.class) {
                if (instance == null) {
                    instance = new DCL();
                }
            }
        }
        return instance;
    }

    public void message() {
        System.out.println("double-checked locking");
    }
}
