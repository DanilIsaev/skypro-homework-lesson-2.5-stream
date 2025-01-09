package com.homework.stream.skypro.homework.lesson25.stream.stream;

import com.homework.stream.skypro.homework.lesson25.stream.employee.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employeeList = new ArrayList<Employee>(List.of(
            new Employee("Nat", "Nat", "Nat", 0, 30000)
    ));

    /*public String natView(){
        return employeeList.get(0).toString();
    }*/

    @Override
    public Employee findEmployeeWithMaxSalary() {
        return null;
    }

    @Override
    public Employee findEmployeeWithMinSalary() {
        return null;
    }

    @Override
    public List<Employee> findEmployeeList() {
        return List.of();
    }

    @Override
    public Map<Integer, List<Employee>> findEmployeeListByDepartament() {
        return Map.of();
    }
}
