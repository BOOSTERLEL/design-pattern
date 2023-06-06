package org.pzd.structural.dynamicProxy.jdk;

/**
 * @author PENG_Zhengda
 * @date 2023/6/2
 * @apiNote
 */
public class ProxyTest {
    public static void main(String[] args) {
        Image image = (Image) JdkProxyFactory.getProxy(new RealImage("java"));
        image.display();
    }
}
