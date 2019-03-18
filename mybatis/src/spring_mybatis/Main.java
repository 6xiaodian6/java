package spring_mybatis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-03-13 15:44:40
 **/
public class Main {
    private static ApplicationContext ctx;
    static {
        ctx = new ClassPathXmlApplicationContext("spring_mybatis/springConfig.xml");
    }

    public static void main(String[] args) {
        StudentMapper studentMapper = (StudentMapper) ctx.getBean("studentMapper");
        Student student = studentMapper.getStudentById(145);
        List<Mark> marks = studentMapper.getStudentMarks(102);
        System.out.println(student.getId());
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getAddress());
        for (Mark mark : marks){
            System.out.print("成绩：" + mark.getMark());
            System.out.print("SID：" + mark.getSid());
            System.out.print("学生姓名：" + mark.getStudent().getName());
            System.out.println("学生id："+mark.getStudent().getId());
        }
    }
}
