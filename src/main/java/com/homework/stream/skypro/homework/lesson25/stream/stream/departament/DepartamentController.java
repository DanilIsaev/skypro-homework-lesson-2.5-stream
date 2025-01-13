package com.homework.stream.skypro.homework.lesson25.stream.stream.departament;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartamentController {

    private final DepartamentService departamentService;

    public DepartamentController(DepartamentService departamentService) {
        this.departamentService = departamentService;
    }

    @GetMapping(path = "/departments/max-salary")
    public String maxSalary(@RequestParam("departmentId") Integer departmentId) {
        return departamentService.findEmployeeWithMaxSalary(departmentId).toString();
    }

    @GetMapping(path = "/departments/min-salary")
    public String minSalary(@RequestParam("departmentId") Integer departmentId) {
        return departamentService.findEmployeeWithMinSalary(departmentId).toString();
    }

    @GetMapping(path = "/departments/all")
    public String findEmployeeList(@RequestParam("departmentId") Integer departmentId) {
        return departamentService.findEmployeeList(departmentId).toString();
    }
}
