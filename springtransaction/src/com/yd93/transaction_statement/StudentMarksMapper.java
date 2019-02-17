package com.yd93.transaction_statement;


import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-02-16 16:06:10
 **/
public class StudentMarksMapper implements RowMapper<StudentMarks> {

    @Override
    public StudentMarks mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        StudentMarks studentMarks = new StudentMarks();
        studentMarks.setId(resultSet.getInt("Id"));
        studentMarks.setName(resultSet.getString("Name"));
        studentMarks.setGender(resultSet.getString("Gender"));
        studentMarks.setAddress(resultSet.getString("Address"));
        studentMarks.setAge(resultSet.getInt("Age"));
        studentMarks.setSid(resultSet.getInt("Sid"));
        studentMarks.setMarks(resultSet.getInt("Marks"));
        studentMarks.setYear(resultSet.getInt("Year"));
        return studentMarks;
    }
}
