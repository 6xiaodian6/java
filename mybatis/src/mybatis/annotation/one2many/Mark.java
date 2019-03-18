package mybatis.annotation.one2many;

import java.io.Serializable;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-02-28 12:46:52
 **/
public class Mark implements Serializable {
    private int mark;
    private int year;
    private int sid;

    public int getMark() {
        return mark;
    }

    public void setMark(int marks) {
        this.mark = marks;
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
