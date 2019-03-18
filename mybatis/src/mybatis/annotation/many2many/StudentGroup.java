package mybatis.annotation.many2many;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-03-12 11:09:07
 **/
public class StudentGroup {
    private int studentId;
    private int markId;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getMarkId() {
        return markId;
    }

    public void setMarkId(int markId) {
        this.markId = markId;
    }
}
