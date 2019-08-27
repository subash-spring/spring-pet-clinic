package application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by subash on 8/26/19.
 */

@Controller
public class IndexController {


    @RequestMapping({"","/","index","index.html"})
    public String index() {
        System.out.println("Reached subash");
        return "index";
    }


}
