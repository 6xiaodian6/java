package mybatis.annotation.crud;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-02-20 08:37:23
 **/
public class MainApp {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static {
        try {
            //加载配置文件
            reader = Resources.getResourceAsReader("mybatis/annotation/crud/Configure.xml");
            //获取配置文件创建工厂
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
    //        getStudent();
    //        getStudentList();
    //        insertStudent();
            updateStudent();
//                deleteStudent();
        }finally {
            //在mybatis里面session用完之后必须关闭，但和spring整合之后就不用自己关闭了
            session.close();
        }
    }

    private static void deleteStudent() {
        try {
            SqlSession session = sqlSessionFactory.openSession();
            IStudent iStudent = session.getMapper(IStudent.class);
            iStudent.deleteStudent(155);
            session.commit();
            System.out.println("删除完成");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void updateStudent() {
        try{
            SqlSession session = sqlSessionFactory.openSession();
            IStudent iStudent = session.getMapper(IStudent.class);
            Student student = iStudent.getStudent(139);
            student.setAddress("湖北省");
            iStudent.updateStudent(student);
            System.out.println("更新完成");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void insertStudent() {
        try {
            SqlSession session = sqlSessionFactory.openSession();
            IStudent iStudent = session.getMapper(IStudent.class);
            //用有参构造方法进行赋值
            Student student = new Student(18, "Tom", "男", "河南省洛阳市");
            //用无参构造方法赋值
//            Student student1 = new Student();
//            student1.setName("Tom");
//                      ...
            iStudent.insertStudent(student);
            session.commit();
            System.out.println("插入之后的数据");
            getStudentList();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void getStudent() {
        try{
            SqlSession session = sqlSessionFactory.openSession();
            //xml方式进行的sql语句执行
            Student student1 = session.selectOne("mybatis.annotation.crud.IStudent.getStudent",102);
            printStudent(student1);
            //接口方式的sql语句执行
            IStudent iStudent = session.getMapper(IStudent.class);
            Student student2 = iStudent.getStudent(102);
            printStudent(student2);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void getStudentList() {
       try {
           SqlSession session = sqlSessionFactory.openSession();
           IStudent iStudent = session.getMapper(IStudent.class);
           System.out.println("Test Get Start...");
           printStudent(iStudent.getStudentList());
           System.out.println("Test Get Finished...");
       }catch (Exception e){
           e.printStackTrace();
       }
    }

    //打印学生列表，和打印学生仅仅是参数不同而已，需要依赖打印学生的方法
    private static void printStudent(final List<Student> students) {
        int count = 1;
        for (Student student : students){
            System.out.println("===================第" + count + "个学生信息=================");
            printStudent(student);
            count++;
        }
    }
    //打印学生信息，是个独立的方法，不需要每次都写打印列表，属于抽象而成的一个方法
    private static void printStudent(Student student){
        System.out.print("ID：" + student.getId());
        System.out.print("  姓名：" + student.getName());
        System.out.print("  性别：" + student.getGender());
        System.out.print("  年龄：" + student.getAge());
        System.out.println("    地址：" + student.getAddress());
    }
}
