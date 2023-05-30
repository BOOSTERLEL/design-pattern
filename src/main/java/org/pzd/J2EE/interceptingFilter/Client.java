package org.pzd.J2EE.interceptingFilter;

/**
 * @author PENG_Zhengda
 * @date 2023/5/30
 * @apiNote
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager) {
        this.filterManager = filterManager;
    }

    public void sendRequest(String request) {
        filterManager.filterRequest(request);
    }
}
