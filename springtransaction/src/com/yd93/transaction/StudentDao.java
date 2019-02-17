package com.yd93.transaction;

import javax.sql.DataSource;
import java.util.List;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-28 08:59:24
 **/
public interface StudentDao {
    public void setDataSource(DataSource dataSource);

    public void create(String name,String gender,Integer age,String address,
                       Integer marks,Integer year);
    public List<StudentMarks> listStudents();
    
}
