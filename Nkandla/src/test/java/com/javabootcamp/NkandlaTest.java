package com.javabootcamp;

import org.junit.*;
import static org.junit.Assert.*;

public class NkandlaTest {
    
    @Test
    public void testNkandlaConstructor()
    {
        Nkandla nkandla = new Nkandla();
        assertEquals(nkandla.getClass(), Nkandla.class);  
    }
    
}
