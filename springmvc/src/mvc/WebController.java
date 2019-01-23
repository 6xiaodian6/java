package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description:
 * @Author：yd93
 * @Create on：2019-01-22 13:07:09
 **/
@Controller
@RequestMapping("/redirect")
public class WebController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/redirect",method = RequestMethod.GET)
    public String redirect(){
        return "redirect:finalPage";
    }
    @RequestMapping(value = "/finalPage",method = RequestMethod.GET)
    public String finalPage(){
        return "final";
    }

    //加载静态页面
    @RequestMapping(value = "/static",method = RequestMethod.GET)
    public String staticPage(){
        return "static";
    }
    @RequestMapping(value = "/staticPage", method = RequestMethod.GET)
    public String redirectStatic(){
        return "redirect:/pages/final.html";
    }
}
