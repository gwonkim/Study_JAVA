package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

}
