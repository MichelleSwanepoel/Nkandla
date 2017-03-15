package com.javabootcamp;

import java.util.Arrays;

public class Politician extends Person
{
    private HomeStead visiting;
    private PersonType[] employees;

    public void setEmployees(PersonType[] _employees)
    {
        employees = _employees;
    }

    public PersonType[] getEmployees()
    {
        return Arrays.copyOf(employees, employees.length);
    }

    public void visit(HomeStead homeStead){
        visiting = homeStead;
        System.out.println(this.getName() + ", a " + this.getPersonType() + ", is now visiting " + visiting.getName());
    }
}
