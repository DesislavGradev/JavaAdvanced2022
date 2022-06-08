package Lec6_DefiningClasses.Exercises.CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public double calculateAverageSalary() {
        return employees.stream().mapToDouble(el -> el.getSalary()).average().orElse(0);
    }

    public String getName() {
        return this.name;
    }

    public List<Employee> getEmployees(){
        return this.employees;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}
