package springMVC_mybatis;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-03-16 09:33:34
 **/

@Controller
@RequestMapping("/student")
public class StudentController {
    //spring中的自动装配模式，用于直接创建单例对象
    @Autowired
    StudentMapper studentMapper;

    @RequestMapping("/marks")
    public ModelAndView listall(HttpServletRequest request, HttpServletResponse response){
        List<Mark> marks = studentMapper.getStudentMarks(102);
        System.out.println("Marks");
        ModelAndView modelAndView = new ModelAndView("student_marks");
        modelAndView.addObject("marks",marks);
        return modelAndView;
    }
}
