package demos;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**

 * Created by palao on 2016-07-14.

 */

@Controller
public class MainController {



    @RequestMapping("/")
    public String Index(Model model) throws Exception {
        System.out.println("index");
        return "home";

    }



    @RequestMapping("/main.do")
    public String Main(Model model) throws Exception {
        System.out.println("main");
        return "home";

    }

}
