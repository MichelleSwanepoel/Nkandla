package com.javabootcamp;

import java.util.Arrays;
import static org.junit.Assert.assertEquals;
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
        Politician.PersonType[] testEmployees = [Politician.PersonType.Lawyer, Politician.PersonType.Architect];
        politician.setEmployees([Politician.PersonType.Lawyer, Politician.PersonType.Architect]);
        Politician.PersonType[] employees = politician.getEmployees();
        
        Arrays.sort(testEmployees);
        Arrays.sort(employees);
        assertTrue(Arrays.equals(testEmployees, employees));
        assertFalse(testEmployees == employees);
    }

}
