package org.pzd.J2EE.businessDelegate;

/**
 * @author PENG_Zhengda
 * @date 2023/5/30
 * @apiNote
 */
public class EJBService implements BusinessService {
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
