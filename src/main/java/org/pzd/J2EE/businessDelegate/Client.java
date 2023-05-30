package org.pzd.J2EE.businessDelegate;

/**
 * @author PENG_Zhengda
 * @date 2023/5/30
 * @apiNote
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessDelegate) {
        this.businessService = businessDelegate;
    }

    public void doTask() {
        businessService.doTask();
    }
}
