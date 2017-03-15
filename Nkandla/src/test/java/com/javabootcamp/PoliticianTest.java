package com.javabootcamp;

import java.util.Arrays;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class PoliticianTest
{
    Politician politician;

    @Before
    public void createInstance()
    {
        politician = new Politician();
    }

    @Test
    public void testPoliticianConstructor()
    {
        assertEquals(politician.getClass(), Politician.class);
    }

    @Test
    public void testPoliticianEmployeesGetterAndSetter()
    {
        Politician.PersonType[] testEmployees = {Politician.PersonType.LAWYER, Politician.PersonType.ARCHITECT};
        politician.setEmployees(testEmployees);
        Politician.PersonType[] employees = politician.getEmployees();

        Arrays.sort(testEmployees);
        Arrays.sort(employees);
        assertTrue(Arrays.equals(testEmployees, employees));
        assertFalse(testEmployees == employees);
    }

//    @Test
//    public void testPoliticianFireEmployeeExists()
//    {
//        Boolean fireSuccess;
//        politician.setEmployees([Politician.PersonType.Lawyer, Politician.PersonType.Architect]);
//        fireSuccess = politician.fireEmployee(Politician.PersonType.Lawyer);
//        assertTrue(fireSuccess);
//
//        Politician.PersonType[] employees = politician.getEmployees();
//
//    }

    @Test
    public void testPoliticianVisit()
    {
        //TODO: will have to either redirect or mock System.out to test this
    }

}
