package com.homework.stream.skypro.homework.lesson25.stream.stream.departament;

import com.homework.stream.skypro.homework.lesson25.stream.employee.Employee;
import com.homework.stream.skypro.homework.lesson25.stream.stream.employee.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import static java.util.Comparator.comparingDouble;
import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

@Service
public class DepartamentServiceImpl implements DepartamentService {

    private final EmployeeService employeeService;

    public DepartamentServiceImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public Employee findEmployeeWithMaxSalary(int departamentID) {
        return employeeService
                .findAll()
                .stream()
                .filter(e -> e.getDepartmentEmployee() == departamentID)
                .max(comparingDouble(Employee::getSalaryEmployee))
                .orElseThrow(RuntimeException::new);
    }

    @Override
    public Employee findEmployeeWithMinSalary(int departamentID) {
        return employeeService
                .findAll()
                .stream()
                .filter(e -> e.getDepartmentEmployee() == departamentID)
                .min(comparingDouble(Employee::getSalaryEmployee))
                .orElseThrow(RuntimeException::new);
    }


    @Override
    public List<Employee> findEmployeeList(int departamentID) {
        return employeeService
                .findAll()
                .stream()
                .filter(e -> e.getDepartmentEmployee() == departamentID)
                .collect(toList());
    }

    @Override
    public Map<Integer, List<Employee>> findEmployeeListByDepartament() {
        return employeeService
                .findAll()
                .stream()
                .collect(groupingBy(Employee::getDepartmentEmployee));
    }
}
