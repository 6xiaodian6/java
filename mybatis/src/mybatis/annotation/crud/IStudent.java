package mybatis.annotation.crud;

import java.util.List;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-02-19 08:19:45
 **/
public interface IStudent {
    public List<Student> getStudentList();

    public void insertStudent(Student student);

    public void updateStudent(Student student);

    public void deleteStudent(int studentId);

    public Student getStudent(int id);
}
