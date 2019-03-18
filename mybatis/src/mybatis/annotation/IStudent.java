package mybatis.annotation;

import mybatis.model.Student;
import org.apache.ibatis.annotations.Select;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-02-18 16:46:59
 **/
public interface IStudent {
    @Select("select * from student where id=#{id}")
    public Student getStudentByID(int id);
}
