package spring_mybatis;

import java.util.List;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-03-14 11:10:58
 **/
public interface StudentMapper {
        List<Mark> getStudentMarks(int studentId);
        Student getStudentById(int id);
}
