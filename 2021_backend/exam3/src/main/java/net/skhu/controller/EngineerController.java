package net.skhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.repository.EngineerRepository;
import net.skhu.repository.RoleRepository;

@Controller
public class EngineerController {

	@Autowired EngineerRepository engineerRepository;
    @Autowired RoleRepository roleRepository;

    @RequestMapping("engineer/list")
    public String list1(Model model) {
        model.addAttribute("engineers", engineerRepository.findAll());
        return "engineer/list";
    }

    @RequestMapping("role/list")
    public String list2(Model model) {
        model.addAttribute("roles", roleRepository.findAll());
        return "role/list";
    }
}
