package com.homework.stream.skypro.homework.lesson25.stream.stream;

import com.homework.stream.skypro.homework.lesson25.stream.employee.Employee;

import java.util.List;
import java.util.Map;

public interface EmployeeService {
    Employee findEmployeeWithMaxSalary();

    Employee findEmployeeWithMinSalary();

    List<Employee> findEmployeeList();

    Map<Integer, List<Employee>> findEmployeeListByDepartament();

    /*public String natView();*/


}
