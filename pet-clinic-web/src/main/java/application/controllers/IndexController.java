package application.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by subash on 8/26/19.
 */

@Controller
public class IndexController {


    @RequestMapping({"","/","index","index.html"})
    public String index() {
        return "index";
    }



    @RequestMapping("/oups")
    public String findOwners(Model model){
        return "notimplemented";
    }
}
