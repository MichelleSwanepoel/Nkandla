package com.javabootcamp;

public class Person
{
    private String name;
    private int age;
    private Gender gender;
    private PersonType personType;

    public String getName()
    {
        return name;
    }

    public void setName(String _name)
    {
        name = _name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int _age)
    {
        age = _age;
    }

    public Gender getGender()
    {
        return gender;
    }

    public void setGender(Gender _gender)
    {
        gender = _gender;
    }

    public PersonType getPersonType()
    {
        return personType;
    }

    public void setPersonType(PersonType _personType)
    {
        personType = _personType;
    }

    public enum Gender{
      MALE, FEMALE
    }

    public enum PersonType{
      PRESIDENT
    }


}
