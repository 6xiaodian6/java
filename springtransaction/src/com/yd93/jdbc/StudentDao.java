package com.yd93.jdbc;

import javax.sql.DataSource;
import java.util.List;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-25 13:23:16
 **/
public interface StudentDao {
    public void setDataSource(DataSource ds);

    public void create(String name,Integer age, String gender,String address);

    public Student getStudent(Integer id);

    public List<Student> listStudents();

    public void delete(Integer id);

    public void update(Integer id,Integer age);
}
