package mybatis;

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
 * @Create on：2019-02-18 08:28:53
 **/
public class MainApp {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;
    static {
        try {
            reader = Resources.getResourceAsReader("mybatis/config/Configure.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static SqlSessionFactory getSession(){
        return sqlSessionFactory;
    }
    public static void main(String[] args) {
        SqlSession session = sqlSessionFactory.openSession();
        try {
            Student student = session.selectOne("mybatis.mapper.StudentMapper.get",119);
            if (student != null){
                String studentInfo = "名字：" + student.getName() + "，年龄：" + student.getAge() + "，性别：" + student.getGender() + "，地址：" + student.getAddress();
                System.out.println(studentInfo);
            }
        }finally {
            session.close();
        }

    }
}
