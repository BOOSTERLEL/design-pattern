package org.pzd.structural.dynamicProxy.CGLIB;

/**
 * @author PENG_Zhengda
 * @date 2023/6/2
 * @apiNote
 */
public class CGLIBTest {
    public static void main(String[] args) {
        Image image = (Image) CglibProxyFactory.getProxy(Image.class);
        image.display();
    }
}
