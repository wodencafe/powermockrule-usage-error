package com.example;
import org.junit.Test;
import org.powermock.modules.junit4.rule.PowerMockRule;

import org.junit.Rule;

public class SuccessTest {
    @Rule
    public PowerMockRule rule = new PowerMockRule();
    
    @Test
    public void test() {
    	System.out.println("Hello world!");
    }
}
