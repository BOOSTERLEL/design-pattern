package org.pzd.J2EE.frontController;

/**
 * @author PENG_Zhengda
 * @date 2023/5/30
 * @apiNote
 */
public class FrontControllerTest {
    public static void main(String[] args) {
        FrontController frontController = new FrontController();
        frontController.dispatchRequest("HOME");
        frontController.dispatchRequest("STUDENT");
    }
}
