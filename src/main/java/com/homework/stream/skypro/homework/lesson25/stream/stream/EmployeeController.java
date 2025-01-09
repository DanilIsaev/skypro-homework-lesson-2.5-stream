package com.homework.stream.skypro.homework.lesson25.stream.stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public String pageWelcome() {
        return "Welcome";
    }

    /*@GetMapping("/nat")
    public String nat() {
        return employeeService.natView();
    }*/
}
