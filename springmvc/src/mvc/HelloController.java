package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-18 16:37:48
 **/

@Controller
@RequestMapping("/")
public class HelloController {
    //注解拦截的请求提交方式为GET请求
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model){
        model.addAttribute("message","Hello Spring MVC Framework!!!");
        return "hello";
    }
}
