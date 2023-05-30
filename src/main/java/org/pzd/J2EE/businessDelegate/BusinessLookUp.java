package org.pzd.J2EE.businessDelegate;

/**
 * @author PENG_Zhengda
 * @date 2023/5/30
 * @apiNote
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType) {
        if (serviceType.equalsIgnoreCase("EJB")) {
            return new EJBService();
        } else {
            return new JMSService();
        }
    }
}
