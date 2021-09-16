package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.dto.Student;

@Controller
@RequestMapping("third")
public class ThirdController {

	@RequestMapping("test1")
	public String test1(Model model) {
		Student student = new Student(1, "201914126", "김지원", "wo41896804@gmail.com");
		model.addAttribute("student", student);
		return "third/test1";
	}

    @GetMapping("test3")
    public String test3(Model model) {
        model.addAttribute("student", new Student());
        return "third/test3";
    }

    @PostMapping("test3")
    public String test3(Model model, Student student) {
        model.addAttribute("message", "저장되었습니다");
        return "third/test3";
    }

}
