package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.MainApp;

public class MainAppTest {

    @Test
    public void testAddition() {
        MainApp main = new MainApp();

        int result = main.addition(5, 6);
        assertEquals(11, result);

        
        result=main.addition(-4, -6);
        assertEquals(-10,result);
    }
}
