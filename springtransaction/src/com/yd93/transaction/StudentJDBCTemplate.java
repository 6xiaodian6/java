package com.yd93.transaction;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import javax.sql.DataSource;
import java.util.List;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-28 08:57:54
 **/
public class StudentJDBCTemplate implements StudentDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;
    private PlatformTransactionManager transactionManager;

    @Override
    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }
    public void setTransactionManager(
            PlatformTransactionManager transactionManager){
        this.transactionManager = transactionManager;
    }

    @Override
    public void create(String name, String gender, Integer age, String address, Integer marks, Integer year) {
        TransactionDefinition definition = new DefaultTransactionDefinition();
        TransactionStatus status = transactionManager.getTransaction(definition);
        try {
            String SQL1 = "insert into Student (name,gender,age,address) values (?,?,?,?)";
            jdbcTemplateObject.update(SQL1, name, gender, age, address);
            String SQL2 = "select max(id) from student";
            //这里的queryForObject方法的第三个参数是返回值类型，这个类型是Class类型的，必须获取某类型后加.class
            Integer sid = jdbcTemplateObject.queryForObject(SQL2, Integer.class);
            String SQL3 = "insert into Marks(sid,marks,year) values(?,?,?)";
            jdbcTemplateObject.update(SQL3, sid, marks, year);
            System.out.println("创建记录，名字 = " + name + ", 年龄 = " + age + "成绩 =" + marks);
            transactionManager.commit(status);
        }catch (DataAccessException e){
            System.out.println("创建记录失败，开始回滚... ");
            transactionManager.rollback(status);
            throw e;
        }
        return;
    }

    @Override
    public List<StudentMarks> listStudents() {
        String SQL = "select * from student,marks where student.id=marks.sid";
        List<StudentMarks> studentMarks = jdbcTemplateObject.query(SQL,new StudentMarksMapper());
        return studentMarks;
    }
}
