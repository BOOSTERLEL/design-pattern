package org.pzd.J2EE.compositeEntity;

/**
 * @author PENG_Zhengda
 * @date 2023/5/30
 * @apiNote
 */
public class CompositeEntityTest {
    public static void main(String[] args) {
        Client client = new Client();
        client.setData("Test", "Data");
        client.printData();
        client.setData("Second Test", "Data1");
        client.printData();
    }
}
