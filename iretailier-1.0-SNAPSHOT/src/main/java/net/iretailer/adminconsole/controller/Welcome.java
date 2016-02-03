package net.iretailer.adminconsole.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/welcome")
public class Welcome {

    @RequestMapping(value="/index", method= RequestMethod.GET)
    public String index(Model model) {
        // do nothing with the model
        return "welcomeIndex";
    }
}
