package org.pzd.J2EE.dataAccessObject;

import java.util.List;

/**
 * @author PENG_Zhengda
 * @date 2023/5/30
 * @apiNote
 */
public interface StudentDao {
    public List<Student> getAllStudents();

    public Student getStudent(int rollNo);

    public void updateStudent(Student student);

    public void deleteStudent(Student student);
}
