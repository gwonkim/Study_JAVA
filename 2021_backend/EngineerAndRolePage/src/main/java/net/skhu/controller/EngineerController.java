package net.skhu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import net.skhu.entity.Engineer;
import net.skhu.model.Pagination;
import net.skhu.repository.EngineerRepository;
import net.skhu.repository.RoleRepository;

@Controller
@RequestMapping("engineer")
public class EngineerController {

    @Autowired EngineerRepository engineerRepository;
    @Autowired RoleRepository roleRepository;

    @RequestMapping("list")
    public String list(Model model, Pagination pagination) {
        List<Engineer> engineers = engineerRepository.findByRoleId(pagination);
        model.addAttribute("engineers", engineers);
        model.addAttribute("roles", roleRepository.findAll());
        return "engineer/list";
    }

    @GetMapping("create")
    public String create(Model model, Pagination pagination) {
        model.addAttribute("engineer", new Engineer());
        model.addAttribute("roles", roleRepository.findAll());
        return "engineer/edit";
    }

    @PostMapping("create")
    public String create(Model model, Engineer engineer, Pagination pagination) {
    	engineerRepository.save(engineer);
        pagination.setRi(0);
        int lastPage = (int)Math.ceil((double)engineerRepository.count() / pagination.getSz());
        pagination.setPg(lastPage);
        return "redirect:list?" + pagination.getQueryString();
    }

    @GetMapping("edit")
    public String edit(Model model, @RequestParam("id") int id, Pagination pagination) {
    	Engineer engineer = engineerRepository.findById(id).get();
        model.addAttribute("engineer", engineer);
        model.addAttribute("roles", roleRepository.findAll());
        return "engineer/edit";
    }

    @PostMapping(value="edit", params="cmd=save")
    public String edit(Model model, Engineer engineer, Pagination pagination) {
    	engineerRepository.save(engineer);
        return "redirect:list?" + pagination.getQueryString();
    }

    @PostMapping(value="edit", params="cmd=delete")
    public String delete(Model model, @RequestParam("id") int id, Pagination pagination) {
    	engineerRepository.deleteById(id);
        return "redirect:list?" + pagination.getQueryString();
    }
}


