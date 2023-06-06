package org.pzd.structural.dynamicProxy.jdk;

/**
 * @author PENG_Zhengda
 * @date 2023/6/2
 * @apiNote
 */
public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }
}
