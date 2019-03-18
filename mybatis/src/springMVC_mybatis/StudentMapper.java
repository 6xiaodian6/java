package springMVC_mybatis;

import java.util.List;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-03-16 09:35:18
 **/
public interface StudentMapper {
    List<Mark> getStudentMarks(int studentId);
    Student getStudentById(int studentId);
}
