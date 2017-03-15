package com.javabootcamp;

import org.junit.*;
import static org.junit.Assert.*;

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
}
