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
public class Close10Test {
    Close10 c10;
    
    public Close10Test() {
        c10 = new Close10();
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
     * Test of close10 method, of class Close10.
     */
    @Test
    public void testClose10() {
        System.out.println("Testing Close10");
        assert c10.close10(8, 13) == 8;
        assert c10.close10(13, 8) == 8;
        assert c10.close10(13, 7) == 0;
        assert c10.close10(7, 13) == 0;
        assert c10.close10(9, 13) == 9;
        assert c10.close10(13, 8) == 8;
        assert c10.close10(10, 12) == 10;
        assert c10.close10(11, 10) == 10;
        assert c10.close10(5, 21) == 5;
        assert c10.close10(0, 20) == 0;
        assert c10.close10(10, 10) == 0;
        System.out.println("Close10 passed");

    }
    
}
