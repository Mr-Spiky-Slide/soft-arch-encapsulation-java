package edu.wctc.part4;

import java.util.ArrayList;
import java.util.List;

public class HumanResourcesEmployee {
    private List<Employee> employees = new ArrayList<>();
    public HumanResourcesEmployee() {
        //super();
    }

    public void createNewEmployee(String firstName, String lastName, String ssn){
        Employee employee = new Employee(firstName, lastName, ssn);
        employees.add(employee);
        employee.doFirstTimeOrientation("9");
    }




}
