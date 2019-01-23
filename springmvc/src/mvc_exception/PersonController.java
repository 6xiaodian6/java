package mvc_exception;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-22 15:06:11
 **/
@Controller
@RequestMapping(value = "/exception")
public class PersonController {
    @RequestMapping(value = "/person",method = RequestMethod.GET)
    public ModelAndView person(){
        return new ModelAndView("person","command",new Person());
    }

    @RequestMapping(value = "/addPerson",method = RequestMethod.POST)
    @ExceptionHandler({SpringException.class})
    public String addStudent(@ModelAttribute("person") Person person, ModelMap model){
        if (person.getName().length() < 5 ){
            throw new SpringException("你填写的名字太短了");
        }else{
            model.addAttribute("name",person.getName());
        }
        if (person.getAge() < 10){
            throw new SpringException("年龄太小了，不要玩这个游戏");
        }else{
            model.addAttribute("age",person.getAge());
        }
        model.addAttribute("id",person.getId());
        return "result";
    }
}
