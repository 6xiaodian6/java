package mybatis.annotation.one2many;

import java.io.Serializable;
import java.util.List;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-02-19 08:18:51
 **/
public class Student implements Serializable {
    private int id;
    private int age;
    private String name;
    private String gender;
    private String address;
    private List<Mark> marks;

    public Student(int age, String name, String gender, String address) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.address = address;
    }

    //当有参构造函数被显式的写出来时，那么无参的构造函数也要被显式的写出来，否则就会出现方法不存在的错误
    public Student() {
      //无参构造函数里面是任何值和信息都不用返回的，直接写一个和类名一样的无参方法就可以了
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Mark> getMarks() {
        return marks;
    }

    public void setMarks(List<Mark> marks) {
        this.marks = marks;
    }
}
