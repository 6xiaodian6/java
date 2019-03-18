package mybatis.annotation.many2many;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.Reader;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-03-12 15:45:10
 *
 * 本例还未实现所有的功能，多对多是在数据库中比较常用的操作，所以，以后进行操作的机会还有很多，这里就不再进行具体的操作
 **/
public class MainApp {
    private static SqlSessionFactory sqlSessionFactory;
    private static Reader reader;

    static {
        try{
            reader = Resources.getResourceAsReader("mybatis/annotation/many2many/Configure.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        testAddGroup();
        testAddStudent();
        testAddStudentGroup();
        testGetGroupAndStudent();
    }

    private static void testGetGroupAndStudent() {
        StudentGroup studentGroup = new StudentGroup();
        SqlSession session = sqlSessionFactory.openSession();
        try{
            Student student = session.selectOne("mybatis.annotation.many2many.StudentGroup.getStudentById",102);
            System.out.println(student.getId());
        }finally {
            session.close();
        }
    }

    private static void testAddStudentGroup() {
    }

    private static void testAddStudent() {
    }

    private static void testAddGroup() {
    }
}
