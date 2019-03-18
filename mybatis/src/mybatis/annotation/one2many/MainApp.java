package mybatis.annotation.one2many;

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
 * @Create on：2019-02-28 14:36:08
 **/
public class MainApp {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;
    static {
        try{
            reader = Resources.getResourceAsReader("mybatis/annotation/one2many/Configure.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SqlSession session = sqlSessionFactory.openSession();
        try{
            Student student = session.selectOne("mybatis.annotation.one2many.StudentMapper.getStudent",102);
            System.out.println(student.getId());

            List<Mark> marks = student.getMarks();
            int count=1;
            for (Mark marks1 : marks){
                System.out.println("--------------第" + count + "次输出----------------");
                System.out.println("marks的SID: " + marks1.getSid());
                System.out.println("marks的Year: " + marks1.getYear());
                System.out.println("marks的marks: " + marks1.getMark());
                count++;
            }
        }finally {
            session.close();
        }
    }
}
