package mybatis.annotation;

import mybatis.model.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-02-18 16:51:14
 **/
public class MainApp {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;
    static {
            try {
                reader = Resources.getResourceAsReader("mybatis/config/Configure.xml");
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
                sqlSessionFactory.getConfiguration().addMapper(IStudent.class);
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
    public static SqlSessionFactory getSession(){
        return sqlSessionFactory;
    }

    public static void main(String[] args) {
        SqlSession session = sqlSessionFactory.openSession();
        try{
            IStudent iStudent = session.getMapper(IStudent.class);
            Student student = iStudent.getStudentByID(102);
            System.out.println("姓名：" + student.getName());
            System.out.println("年龄：" + student.getAge());
            System.out.println("性别：" + student.getGender());
            System.out.println("地址：" + student.getAddress());
        }finally {
            session.close();
        }
    }
}
