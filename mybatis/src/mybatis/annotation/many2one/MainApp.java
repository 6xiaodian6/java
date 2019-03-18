package mybatis.annotation.many2one;

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
 * @Create on：2019-03-02 14:11:27
 **/
public class MainApp {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;
    static {
        try {
            reader = Resources.getResourceAsReader("mybatis/annotation/many2one/Configure.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        SqlSession session = sqlSessionFactory.openSession();
       try {
           List<Mark> mark = session.selectList("mybatis.annotation.many2one.StudentMapper.getMark", 102);
           for (Mark mark1 : mark) {
               System.out.print(mark1.getSid());
               System.out.print(mark1.getStudent().getName());
               System.out.print(mark1.getYear());
               System.out.println(mark1.getMark());
           }
       }finally {
           session.close();
       }
    }
}
