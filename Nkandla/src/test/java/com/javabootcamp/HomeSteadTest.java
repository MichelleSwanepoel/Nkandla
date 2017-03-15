package com.javabootcamp;

import org.junit.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class HomeSteadTest
{
    HomeStead homeStead;

    @Before
    public void createInstance()
    {
        homeStead = new HomeStead();
    }


    @Test
    public void testHomeSteadConstructor()
    {
        assertEquals(homeStead.getClass(), HomeStead.class);
    }

    @Test
    public void testNameGetterAndSetter()
    {
        homeStead.setName("TestName");
        assertEquals(homeStead.getName(), "TestName");
    }

    @Test
    public void testDistrictGetterAndSetter()
    {
        homeStead.setDistrict("TestDistrict");
        assertEquals(homeStead.getDistrict(), "TestDistrict");
    }

    @Test
    public void testProvinceGetterAndSetter()
    {
        homeStead.setProvince("TestProvince");
        assertEquals(homeStead.getProvince(), "TestProvince");
    }

    @Test
    public void testCountryGetterAndSetter()
    {
        homeStead.setCountry("TestCountry");
        assertEquals(homeStead.getCountry(), "TestCountry");
    }

    @Test
    public void testAcceptSuccess()
    {
        Visitor visitor = mock(Visitor.class);

        when(visitor.getPersonType()).thenReturn(Person.PersonType.PRESIDENT);
        homeStead.accept(visitor);
        verify(visitor, times(1)).visit(homeStead);
    }

    @Test(expected=UnauthorisedVisitorException.class)
    public void testAcceptFail()
    {
        Visitor visitor = mock(Visitor.class);

        when(visitor.getPersonType()).thenReturn(Person.PersonType.LAWYER);
        homeStead.accept(visitor);
    }

}
