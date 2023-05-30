package org.pzd.J2EE.interceptingFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PENG_Zhengda
 * @date 2023/5/30
 * @apiNote
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void execute(String request) {
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}
