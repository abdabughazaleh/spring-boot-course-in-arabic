package com.springcourse.hr.controller;

import com.springcourse.hr.model.dto.AddressDTO;
import com.springcourse.hr.model.dto.EmployeeDTO;
import com.springcourse.hr.service.EmployeeServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequiredArgsConstructor
public class EmployeeController {
    private final EmployeeServiceImpl employeeService;

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("employees", employeeService.getEmployees());
        return "employee";
    }
    @GetMapping("/user")
    public String user() {
        return "user";
    }


}
