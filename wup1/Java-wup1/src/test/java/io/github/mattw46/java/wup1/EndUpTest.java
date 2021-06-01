/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.mattw46.java.wup1;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Matt W
 */
public class EndUpTest {
    EndUp eu;
    
    public EndUpTest() {
        eu = new EndUp();
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of endUp method, of class EndUp.
     */
    @Test
    public void testEndUp() {
        System.out.println("Test EndUp");
        assert eu.endUp("Hello").equals("HeLLO");
        assert eu.endUp("hi there").equals("hi thERE");
        assert eu.endUp("hi").equals("HI");
        assert eu.endUp("woo hoo").equals("woo HOO");	
        assert eu.endUp("xyz12").equals("xyZ12");	
        assert eu.endUp("x").equals("X");	
        assert eu.endUp("").equals("");
        System.out.println("EndUp passed");
    }
    
}
