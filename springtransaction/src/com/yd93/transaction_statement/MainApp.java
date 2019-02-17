package com.yd93.transaction_statement;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-02-16 16:06:51
 **/
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/yd93/transaction_statement/Beans.xml");
        StudentDAO studentJDBCTemplate = (StudentDAO) context.getBean("studentJDBCTemplate");
        System.out.println("---------创建记录---------");
        studentJDBCTemplate.create("Tom","男",18,"河南省郑州市",90,2019);
        studentJDBCTemplate.create("jerry","女",16,"河南省郑州市",91,2019);
        studentJDBCTemplate.create("Tomcat","男",20,"河南省郑州市",92,2019);
        studentJDBCTemplate.create("jerrycat","女",17,"河南省郑州市",99,2019);
        System.out.println("---------记录列表展示-------");
        List<StudentMarks> studentMarks = studentJDBCTemplate.listStudent();
        for (StudentMarks record : studentMarks){
            System.out.print("ID :" + record.getId());
            System.out.print("，姓名 :" + record.getName());
            System.out.print("，年龄 :" + record.getAge());
            System.out.print("，地址 :" + record.getAddress());
            System.out.print("，成绩 :" + record.getMarks());
            System.out.print("，时间 :" + record.getYear());
        }
    }
}
