package com.javabootcamp;

import org.junit.*;
import static org.junit.Assert.*;

public class ChickenRunTest {
    
    ChickenRun chickenRun;
    
    @Before
    public void createInstance()
    {
        chickenRun = new ChickenRun();
    }
    
    @Test
    public void testChickenRunConstructor()
    {
        assertEquals(chickenRun.getClass(), ChickenRun.class);  
    }
    
    
}
