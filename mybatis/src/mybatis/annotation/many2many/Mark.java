package mybatis.annotation.many2many;

import java.util.List;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-03-12 11:08:52
 **/
public class Mark {
    private int mark;
    private int year;
    private int sid;
    private List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
}
