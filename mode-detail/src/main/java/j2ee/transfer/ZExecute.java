package j2ee.transfer;

/**
 * @author Damon
 * @version 1.0 , JDK 1.8
 * @category Package Name:j2ee.transfer
 */
public class ZExecute {
    public static void main(String[] args) {
        StudentBO studentBO = new StudentBO();

        //输出所有的学生
        for (StudentVO student : studentBO.getAllStudents()) {
            System.out.println(
                "Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName()
                    + " ]");
        }

        //更新学生
        StudentVO student = studentBO.getAllStudents().get(0);
        student.setName("Michael");
        studentBO.updateStudent(student);

        //获取学生
        studentBO.getStudent(0);
        System.out.println(
            "Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
    }
}
