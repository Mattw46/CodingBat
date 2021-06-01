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
public class Front3Test {
    Front3 f3;
    
    public Front3Test() {
        f3 = new Front3();
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
     * Test of front3 method, of class Front3.
     */
    @Test
    public void testFront3() {
        System.out.println("Test Front3");
        assert f3.front3("Java").equals("JavJavJav");
        assert f3.front3("Chocolate").equals("ChoChoCho");
        assert f3.front3("abc").equals("abcabcabc");
        assert f3.front3("abcXYZ").equals("abcabcabc");
        assert f3.front3("ab").equals("ababab");
        assert f3.front3("a").equals("aaa");
        assert f3.front3("").equals("");
        System.out.println("Front3 passed");
    }
    
}
