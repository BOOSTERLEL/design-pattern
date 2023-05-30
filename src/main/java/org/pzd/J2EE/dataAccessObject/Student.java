package org.pzd.J2EE.dataAccessObject;

import lombok.Data;

/**
 * @author PENG_Zhengda
 * @date 2023/5/30
 * @apiNote
 */
@Data
public class Student {
    private String name;
    private int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}
