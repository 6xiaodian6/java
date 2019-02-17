package com.yd93.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-25 13:24:34
 **/
public class StudentJDBCTemplate implements StudentDao {

    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    private SimpleJdbcCall jdbcCall;
    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
        this.jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
    }

    @Override
    public void create(String name, Integer age, String gender, String address) {
        String SQL = "insert into Student (name,age,gender,address) values (?,?,?,?)";
        jdbcTemplateObject.update(SQL,name,age,gender,address);
        System.out.println("创建记录：名字 = " + name + "年龄= " + age + "性别= "+ gender + "地址= " + address);
    }

    @Override
    public Student getStudent(Integer id) {
        String SQL = "select * from Student where id = ?";
        Student student = jdbcTemplateObject.queryForObject(SQL,new Object[]{id},new StudentMapper());
        return student;

 /*     执行存储过程的步骤，前提是已经写好了该存储过程

        SqlParameterSource in = new MapSqlParameterSource().addValue("in_id",id);
        Map<String,Object> out = jdbcCall.execute(in);
        Student student = new Student();
        student.setName((String) out.get("out_name"));
        student.setAge((Integer) out.get("out_age"));
        return student;
        */
    }

    @Override
    public List<Student> listStudents() {
        String SQL = "select * from Student";
        List<Student> students = jdbcTemplateObject.query(SQL,new StudentMapper());

        return students;
    }

    @Override
    public void delete(Integer id) {
        String SQL = "delete from Student where id = ?";
        jdbcTemplateObject.update(SQL,id);
        System.out.println("删除记录id为：" + id);
    }

    @Override
    public void update(Integer id, Integer age) {
        String SQL = "update Student set age = ? where id = ?";
        jdbcTemplateObject.update(SQL,age,id);
        System.out.println("更新记录id为：" + id);
    }
}
