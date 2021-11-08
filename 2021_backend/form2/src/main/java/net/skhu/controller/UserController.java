package net.skhu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.dto.User;
import net.skhu.model.UserRegister;
import net.skhu.service.DepartmentService;
import net.skhu.service.UserService;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired UserService userService;
    @Autowired DepartmentService departmentService;

    @GetMapping("list")
    public String list(Model model) {
        model.addAttribute("users", userService.findAll());
        return "user/list";
    }

    @GetMapping("register")
    public String register(Model model) {
        model.addAttribute("userRegister", new UserRegister()); // 빈 userRegister 객체
        model.addAttribute("departments", departmentService.findAll()); // 학과 정보
        return "user/register";
    }

    @PostMapping("register")
    public String register(Model model,
            @Valid UserRegister userRegister, BindingResult bindingResult)
    {
       // if (bindingResult.hasErrors()) { // 검사 에러 시 validation1
        if (userService.hasErrors(userRegister, bindingResult)) { // validation2
            model.addAttribute("departments", departmentService.findAll()); // 학과 정보 다시 넘기기
            return "user/register";
        }
        User user = userService.findByUserid(userRegister.getUserid()); // userId 사용 여부 확인
        if (user != null) {
            bindingResult.rejectValue("userid", null, "사용자 아이디가 중복됩니다."); // reject 에러 등록
            model.addAttribute("departments", departmentService.findAll());
            return "user/register";
        }
        userService.insert(userRegister); // 에러 없으면 insert
        return "redirect:list";
    }
}
