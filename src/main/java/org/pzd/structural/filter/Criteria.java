package org.pzd.structural.filter;

import java.util.List;

/**
 * @author PENG_Zhengda
 * @date 2023/5/26
 * @apiNote
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
