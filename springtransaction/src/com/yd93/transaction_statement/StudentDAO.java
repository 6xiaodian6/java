package com.yd93.transaction_statement;

import javax.sql.DataSource;
import java.util.List;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-02-16 16:07:13
 **/
public interface StudentDAO{
    void setDatasource(DataSource dataSource);

    void create(String name,String gender,Integer age,String address,
                       Integer marks,Integer year);
    List<StudentMarks> listStudent();
}
