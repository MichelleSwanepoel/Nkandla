package com.javabootcamp;

import org.junit.*;
import static org.junit.Assert.*;

public class SwimmingPoolTest {
    
    SwimmingPool swimmingPool;
    
    @Before
    public void createInstance()
    {
        swimmingPool = new SwimmingPool();
    }
    
    @Test
    public void testSwimmingPoolConstructor()
    {
        assertEquals(swimmingPool.getClass(), SwimmingPool.class);  
    }
    
    
}
