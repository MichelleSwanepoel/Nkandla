package com.javabootcamp;

import org.junit.*;
import static org.junit.Assert.*;

public class NkandlaTest {
    
    Nkandla nkandla;
    
    @Before
    public void createInstance()
    {
        nkandla = new Nkandla();
    }
    
    @Test
    public void testNkandlaConstructor()
    {
        assertEquals(nkandla.getClass(), Nkandla.class);  
    }
    
}
