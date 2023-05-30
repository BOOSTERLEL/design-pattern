package org.pzd.J2EE.mvc;

/**
 * @author PENG_Zhengda
 * @date 2023/5/27
 * @apiNote
 */
public class mvcTest {
    public static void main(String[] args) {
        //从数据库获取学生记录
        Student model = retrieveStudentFromDatabase();

        //创建一个视图：把学生详细信息输出到控制台
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        //更新模型数据
        controller.setStudentName("John");

        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
