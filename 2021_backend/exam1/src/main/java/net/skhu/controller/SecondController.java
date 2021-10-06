package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("second")
public class SecondController {

    @RequestMapping("exam3")
    public String exam3(Model model, @RequestParam("name") String name,
                                     @RequestParam("studentNumber") String studentNumber) {
        model.addAttribute("name", name);
        model.addAttribute("studentNumber", studentNumber);
        return "second/exam3";
    }

}

