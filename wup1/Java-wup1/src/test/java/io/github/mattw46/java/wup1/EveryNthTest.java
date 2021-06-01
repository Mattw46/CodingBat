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
public class EveryNthTest {
    EveryNth en;
    
    public EveryNthTest() {
        en = new EveryNth();
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
     * Test of everyNth method, of class EveryNth.
     */
    @Test
    public void testEveryNth() {
        System.out.println("Test EveryNth");
        assert en.everyNth("Miracle", 2).equals("Mrce");
        assert en.everyNth("abcdefg", 2).equals("aceg");
        assert en.everyNth("abcdefg", 3).equals("adg");
        assert en.everyNth("Chocolate", 3).equals("Cca");	
        assert en.everyNth("Chocolates", 3).equals("Ccas");	
        assert en.everyNth("Chocolates", 4).equals("Coe");	
        assert en.everyNth("Chocolates", 100).equals("C");
        System.out.println("EveryNth passed");
    }
    
}
