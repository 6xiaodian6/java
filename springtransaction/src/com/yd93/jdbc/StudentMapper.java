package com.yd93.jdbc;

import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-25 13:24:01
 **/
public class StudentMapper implements RowMapper<Student> {
   public Student mapRow(ResultSet rs,int rowNum) throws SQLException{
        Student student = new Student();
//        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setAge(rs.getInt("age"));
        student.setGender(rs.getString("gender"));
        student.setAddress(rs.getString("address"));
        return student;
    }
}
