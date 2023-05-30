package org.pzd.J2EE.businessDelegate;

/**
 * @author PENG_Zhengda
 * @date 2023/5/30
 * @apiNote
 */
public class BusinessDelegateTest {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServiceType("EJB");

        Client client = new Client(businessDelegate);
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
