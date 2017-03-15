package com.javabootcamp;

import java.util.Arrays;

public class Politician extends Person implements Visitor
{
    private PersonType[] employees;

    public void setEmployees(PersonType[] _employees)
    {
        employees = Arrays.copyOf(_employees, _employees.length);
    }

    public PersonType[] getEmployees()
    {
        return Arrays.copyOf(employees, employees.length);
    }

    public void visit(HomeStead homeStead){
        System.out.println(this.getName() + ", a " + this.getPersonType() + ", is now visiting " + homeStead.getName());
    }
}
