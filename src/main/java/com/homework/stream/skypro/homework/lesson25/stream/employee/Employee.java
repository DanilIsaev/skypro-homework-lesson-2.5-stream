package com.homework.stream.skypro.homework.lesson25.stream.employee;

public class Employee {
    private String nameEmployee;
    private String surnameEmployee;
    private String lastnameEmployee;
    private int departmentEmployee;
    private float salaryEmployee;
    private final int idEmployee;
    private static int idCounter = 0; // Счечик для выдачи id сотруднику

    public Employee(String surnameEmployee, String nameEmployee, String lastnameEmployee, int departmentEmployee, float salaryEmployee) {
        this.surnameEmployee = surnameEmployee;
        this.nameEmployee = nameEmployee;
        this.lastnameEmployee = lastnameEmployee;
        if (departmentEmployee < 0 || departmentEmployee > 6) {
            throw new IllegalArgumentException("Данного отдела не существует");
        }
        this.departmentEmployee = departmentEmployee;
        if (salaryEmployee < 0) {
            throw new IllegalArgumentException("Зарплата не может быть отрицательной");
        }
        this.salaryEmployee = salaryEmployee;
        this.idEmployee = idCounter;
        idCounter++;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getSurnameEmployee() {
        return surnameEmployee;
    }

    public void setSurnameEmployee(String surnameEmployee) {
        this.surnameEmployee = surnameEmployee;
    }

    public String getLastnameEmployee() {
        return lastnameEmployee;
    }

    public void setLastnameEmployee(String lastnameEmployee) {
        this.lastnameEmployee = lastnameEmployee;
    }

    public int getDepartmentEmployee() {
        return departmentEmployee;
    }

    public void setDepartmentEmployee(int departmentEmployee) {
        this.departmentEmployee = departmentEmployee;
    }

    public float getSalaryEmployee() {
        return salaryEmployee;
    }

    public void setSalaryEmployee(float salaryEmployee) {
        this.salaryEmployee = salaryEmployee;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Employee comparisonEmployee = (Employee) other;
        return idEmployee == comparisonEmployee.idEmployee; // return [свойство с типом строки].equals(comparisonEmployee.[свойство с типом строки или get]);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(idEmployee);
    }

    @Override
    public String toString() {
        return idEmployee + " " + surnameEmployee + " " + nameEmployee + " " + lastnameEmployee + " " + departmentEmployee + " " + salaryEmployee;
    }
}

