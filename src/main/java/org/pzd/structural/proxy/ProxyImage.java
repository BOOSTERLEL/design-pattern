package org.pzd.structural.proxy;

/**
 * @author PENG_Zhengda
 * @date 2023/5/27
 * @apiNote
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(filename);
        }
        realImage.display();
    }
}
