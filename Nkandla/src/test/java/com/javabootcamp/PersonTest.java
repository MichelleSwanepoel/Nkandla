package com.javabootcamp;

import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest
{
    private Person person;

    @Before
    public void preTest(){
      person = new Person();
    }

    @After
    public void postTest(){
      person = null;
    }

    @Test
    public void testNameGetterAndSetter()
    {
        person.setName("TestName");
        assertEquals(person.getName(), "TestName");
    }

    @Test
    public void testAgeGetterAndSetter()
    {
        person.setAge(65);
        assertEquals(person.getAge(), 65);
    }

    @Test
    public void testGenderGetterAndSetter()
    {
        person.setGender(Person.Gender.FEMALE);
        assertEquals(person.getGender(), Person.Gender.FEMALE);

        person.setGender(Person.Gender.MALE);
        assertEquals(person.getGender(), Person.Gender.MALE);
    }

    @Test
    public void testPersonTypeGetterAndSetter()
    {
        person.setPersonType(Person.PersonType.PRESIDENT);
        assertEquals(person.getPersonType(), Person.PersonType.PRESIDENT);
    }
}
