package org.pzd.J2EE.transferObject;

import lombok.Data;

/**
 * @author PENG_Zhengda
 * @date 2023/5/30
 * @apiNote
 */
@Data
public class StudentVO {
    private String name;
    private int rollNo;

    StudentVO(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}
