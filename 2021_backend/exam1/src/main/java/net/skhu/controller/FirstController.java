package net.skhu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import net.skhu.dto.Book;
import net.skhu.dto.Student;

@Controller
@RestController
@RequestMapping("first")
public class FirstController {

    @RequestMapping("exam1")
    public Student exam1() {
    	return new Student("201914126", "김지원");
    }

    @RequestMapping("exam2")
    public Book[] exam2() {
        return new Book[] {
            new Book(1, "레미제라블", "빅토리 위고", 10000),
            new Book(2, "홍길동전", "허준", 15000),
        };
    }

    @RequestMapping("exam4")
    public Student exam4(Model model, @RequestParam("name") String name,
            @RequestParam("studentNumber") String studentNumber) {
    		return new Student(name, studentNumber);
    }

}

