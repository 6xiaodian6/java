package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-22 08:45:55
 **/
@Controller
@RequestMapping(value = "/HelloWeb")
public class StudentController {
    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public ModelAndView student(){
        return new ModelAndView("student","command",new Student());
    }
    @RequestMapping(value = "/addStudent",method = RequestMethod.POST)
    /*
    * @ModelAttribute("student")Student student详解：
    *   这一句的意思就是从jsp页面返回一个叫student的值，然后把他自动转换为Student类型的对象，
    *   这个效果和request.getParameters("student")的效果是相同的
    * */
    public String addStudent(@ModelAttribute("student")Student student, ModelMap model){
        model.addAttribute("name",student.getName());
        model.addAttribute("age",student.getAge());
        model.addAttribute("id",student.getId());
        return "result";
    }
}
