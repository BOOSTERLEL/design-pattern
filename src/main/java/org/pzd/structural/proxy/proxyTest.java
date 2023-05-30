package org.pzd.structural.proxy;

/**
 * @author PENG_Zhengda
 * @date 2023/5/27
 * @apiNote
 */
public class proxyTest {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb,jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println("");
        // 图像不需要从磁盘加载
        image.display();
    }
}
