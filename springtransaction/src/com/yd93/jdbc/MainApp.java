package com.yd93.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.util.List;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-25 13:24:41
 **/
public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        StudentJDBCTemplate studentJDBCTemplate =
                (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");
        System.out.println("-------创建记录 --------");
        studentJDBCTemplate.create("Jack",18,"ma","hebei");
        studentJDBCTemplate.create("Jack",18,"ma","hebei");
        studentJDBCTemplate.create("Jack",18,"ma","hebei");
        studentJDBCTemplate.create("Jack",18,"ma","hebei");
        System.out.println("-------复杂列表记录------");
        List<Student> students = studentJDBCTemplate.listStudents();
        for (Student record :students){
//            System.out.println("ID: " + record.getId());
            System.out.println("姓名: " + record.getName());
            System.out.println("性别: " + record.getGender());
            System.out.println("年龄: " + record.getAge());
            System.out.println("地址：" + record.getAddress());
        }
        System.out.println("--------更新记录id=1 ------------");
        studentJDBCTemplate.update(40,20);
        System.out.println("--------列表ID为1 ------------");
        Student student = studentJDBCTemplate.getStudent(40);
        System.out.println("ID:" + student.getId());
        System.out.println("姓名：" + student.getName());
        System.out.println("性别：" + student.getGender());
        System.out.println("年龄; " + student.getAge());
        System.out.println("地址：" + student.getAddress());
    }
}
