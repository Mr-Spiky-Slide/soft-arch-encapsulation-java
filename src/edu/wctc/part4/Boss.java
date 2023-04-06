package edu.wctc.part4;

public class Boss {

    private HumanResourcesEmployee hr = new HumanResourcesEmployee();
    public Boss() {
    }
    public void hirePerson(String firstName, String lastName, String ssn){
        hr.createNewEmployee(firstName, lastName, ssn);

    }
}
