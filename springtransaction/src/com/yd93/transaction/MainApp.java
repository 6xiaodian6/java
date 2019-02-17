package com.yd93.transaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-28 08:58:05
 **/
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(" com/yd93/transaction/Beans.xml");
        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
        System.out.println("---------创建记录----------");
        studentJDBCTemplate.create("jack","na",18,"河北省北京市",19,2019);
        studentJDBCTemplate.create("jack","na",19,"河北省北京市",20,2019);
        studentJDBCTemplate.create("jack","na",20,"河北省北京市",21,2019);
        studentJDBCTemplate.create("jack","na",21,"河北省北京市",22,2019);
        System.out.println("----------所有记录列表-----------");
        List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();
        for (StudentMarks record : studentMarks){
            System.out.print("ID: " + record.getId());
            System.out.print(",Name: " + record.getName());
            System.out.print(",Gender: " + record.getGender());
            System.out.print(",Address: " + record.getAddress());
            System.out.print(", Marks: " + record.getMarks());
            System.out.print(", Year: " + record.getYear());
            System.out.println(", Age: " + record.getAge());
        }
    }
}
