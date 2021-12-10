package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.skhu.entity.Student;
import net.skhu.model.Pagination;
import net.skhu.repository.DepartmentRepository;
import net.skhu.repository.StudentRepository;

@Controller
@RequestMapping("student")
public class StudentController {

    @Autowired StudentRepository studentRepository;
    @Autowired DepartmentRepository departmentRepository;

    @RequestMapping("list")
    public String list(Model model, Pagination pagination) {
        List<Student> students = studentRepository.findByDepartmentId(pagination);
        model.addAttribute("students", students);
        model.addAttribute("departments", departmentRepository.findAll());
        return "student/list";
    }

    @GetMapping("create")
    public String create(Model model, Pagination pagination) {
        model.addAttribute("student", new Student());
        model.addAttribute("departments", departmentRepository.findAll());
        return "student/edit";
    }

    @PostMapping("create")
    public String create(Model model, Student student, Pagination pagination) {
        studentRepository.save(student);
        pagination.setDi(0); // 0, 전체학생 목록
        int lastPage = (int)Math.ceil((double)studentRepository.count() / pagination.getSz()); // 전체 학생 목록에서 마지막 페이지 번호
        pagination.setPg(lastPage);
        return "redirect:list?" + pagination.getQueryString(); // 리다이렉트 메타 태그 출력
    }

    @GetMapping("edit")
    public String edit(Model model, @RequestParam("id") int id, Pagination pagination) {
        Student student = studentRepository.findById(id).get();
        model.addAttribute("student", student);
        model.addAttribute("departments", departmentRepository.findAll());
        return "student/edit";
    }

    @PostMapping(value="edit", params="cmd=save")
    public String edit(Model model, Student student, Pagination pagination) {
        studentRepository.save(student);
        return "redirect:list?" + pagination.getQueryString();
    }

    @PostMapping(value="edit", params="cmd=delete")
    public String delete(Model model, @RequestParam("id") int id, Pagination pagination) {
        studentRepository.deleteById(id);
        return "redirect:list?" + pagination.getQueryString();
    }
}
