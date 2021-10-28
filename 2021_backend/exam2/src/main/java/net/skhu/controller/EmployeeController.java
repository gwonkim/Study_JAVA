package net.skhu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.skhu.dto.Employee;
import net.skhu.mapper.DepartmentMapper;
import net.skhu.mapper.EmployeeMapper;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired EmployeeMapper employeeMapper;
	@Autowired DepartmentMapper departmentMapper;


	@GetMapping("edit")
    public String edit(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("department", departmentMapper.findAll());
        return "employee/edit";
    }

    @PostMapping("edit")
    public String edit(Model model, Employee student) {
        model.addAttribute("message", "저장했습니다.");
        model.addAttribute("department", departmentMapper.findAll());
        return "employee/edit";
    }

    @RequestMapping("list")
    public String list(Model model) {
        model.addAttribute("employees", employeeMapper.findAll());
        return "employee/list";
    }


}
