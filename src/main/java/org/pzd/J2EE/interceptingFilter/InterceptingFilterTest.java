package org.pzd.J2EE.interceptingFilter;

/**
 * @author PENG_Zhengda
 * @date 2023/5/30
 * @apiNote
 */
public class InterceptingFilterTest {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
