package com.yd93.transaction_statement;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-02-16 16:06:41
 **/
public class StudentJDBCTemplate implements StudentDAO{
    private JdbcTemplate jdbcTemplateObject;

    @Override
    public void setDatasource(DataSource dataSource) {
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    @Override
    public void create(String name, String gender, Integer age, String address, Integer marks, Integer year) {
        try {
            String SQL1 = "insert into Student(name,gender,age,address) values(?,?,?,?)";
            jdbcTemplateObject.update(SQL1, name, gender, age, address);

            String SQL2 = "select max(id) from Student";
            Integer sid = jdbcTemplateObject.queryForObject(SQL2, Integer.class);

            String SQL3 = "insert into Marks(sid,marks,year) values(?,?,?)";
            jdbcTemplateObject.update(SQL3, sid, marks, year);
            System.out.println("创建记录, 名字 = " + name + "，年龄 = " + age + "，成绩 = " + marks);
            throw new RuntimeException("自己写的模拟错误状态异常，为测试记录回滚");
        }catch (DataAccessException e){
            System.out.println("记录创建失败，正在回滚中.......");
            throw e;
        }
    }

    @Override
    public List<StudentMarks> listStudent() {
        String SQL = "select * from student, Marks where Student.id=Marks.sid";
        List <StudentMarks> studentMarks = jdbcTemplateObject.query(SQL,new StudentMarksMapper());
        return studentMarks;
    }
}
