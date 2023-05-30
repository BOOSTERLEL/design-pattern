package org.pzd.creational.singletonPattern;

/**
 * @author PENG_Zhengda
 * @date 2023/5/24
 * @apiNote
 */
// 枚举
//public enum SingleObject {
//    INSTANCE;
//
//    public void whateverMethod() {
//    }
//}

// 登记式/静态内部类
//public class SingleObject {
//    private static class SingletonHolder {
//        private static final SingleObject INSTANCE = new SingleObject();
//    }
//
//    private SingleObject() {
//    }
//
//    public static final SingleObject getInstance() {
//        return SingletonHolder.INSTANCE;
//    }
//
//    public void showMessage() {
//        System.out.println("singleton pattern");
//    }
//}

public class SingleObject {
    //创建 SingleObject 的一个对象
    private static final SingleObject instance = new SingleObject();

    //让构造函数为 private，这样该类就不会被实例化
    private SingleObject() {
    }

    //获取唯一可用的对象
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("singleton pattern");
    }
}
