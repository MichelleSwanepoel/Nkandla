package com.javabootcamp;

import org.junit.*;
import static org.junit.Assert.*;

public class AmphitheatreTest {
    
    Amphitheatre amphitheatre;
    
    @Before
    public void createInstance()
    {
        amphitheatre = new Amphitheatre();
    }
    
    @Test
    public void testAmphitheatreConstructor()
    {
        assertEquals(amphitheatre.getClass(), Amphitheatre.class);  
    }
    
    
}
