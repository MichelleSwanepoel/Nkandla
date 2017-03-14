package com.javabootcamp;

import org.junit.*;
import static org.junit.Assert.*;

public class HomeSteadTest 
{
    @Test
    public void testHomeSteadConstructor()
    {
        HomeStead homeStead = new HomeStead();
        assertEquals(homeStead.getClass(), HomeStead.class);  
    }
    
    @Test
    public void testNameGetterAndSetter()
    {
        HomeStead homeStead = new HomeStead();
        homeStead.setName("TestName");
        assertEquals(homeStead.getName(), "TestName");
    }
    
    @Test
    public void testDistrictGetterAndSetter()
    {
        HomeStead homeStead = new HomeStead();
        homeStead.setDistrict("TestDistrict");
        assertEquals(homeStead.getDistrict(), "TestDistrict");
    }
    
    @Test
    public void testProvinceGetterAndSetter()
    {
        HomeStead homeStead = new HomeStead();
        homeStead.setProvince("TestProvince");
        assertEquals(homeStead.getProvince(), "TestProvince");
    }
    
    @Test
    public void testCountryGetterAndSetter()
    {
        HomeStead homeStead = new HomeStead();
        homeStead.setCountry("TestCountry");
        assertEquals(homeStead.getCountry(), "TestCountry");
    }
}
