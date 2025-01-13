package com.homework.stream.skypro.homework.lesson25.stream.stream.departament;


import com.homework.stream.skypro.homework.lesson25.stream.employee.Employee;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface DepartamentService {

    Employee findEmployeeWithMaxSalary(int departamentID);

    Employee findEmployeeWithMinSalary(int departamentID);

    List<Employee> findEmployeeList(int departamentID);

    Map<Integer, List<Employee>> findEmployeeListByDepartament();
}
