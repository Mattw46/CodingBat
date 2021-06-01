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
 * @author neo
 */
public class Diff21Test {
    Diff21 d21;
    
    public Diff21Test() {
        d21 = new Diff21();
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
     * Test of diff21 method, of class Diff21.
     */
    @Test
    public void testDiff21() {
        System.out.println("Test Diff21");
        assert d21.diff21(19) == 2;
        assert d21.diff21(10) == 11;
        assert d21.diff21(21) == 0;
        assert d21.diff21(22) == 2;	
        assert d21.diff21(25) == 8;
        assert d21.diff21(30) == 18;
        assert d21.diff21(0) == 21;
        assert d21.diff21(1) == 20;
        assert d21.diff21(2) == 19;
        assert d21.diff21(-1) == 22;
        assert d21.diff21(-2) == 23;
        assert d21.diff21(50) == 58;
        System.out.println("Diff21 passed");
    }
    
}
