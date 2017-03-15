package com.javabootcamp;

public interface Visitor {
    public void visit(HomeStead homeStead);
    public Person.PersonType getPersonType();
}
