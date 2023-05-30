package org.pzd.J2EE.mvc;

/**
 * @author PENG_Zhengda
 * @date 2023/5/27
 * @apiNote
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo) {
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
