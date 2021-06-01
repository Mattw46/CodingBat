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
public class DelDelTest {
    DelDel dd;
    
    public DelDelTest() {
        dd = new DelDel();
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
     * Test of delDel method, of class DelDel.
     */
    @Test
    public void testDelDel() {
        System.out.println("Test DelDel");
        assert dd.delDel("adelbc").equals("abc");
        assert dd.delDel("adelHello").equals("aHello");
        assert dd.delDel("adedbc").equals("adedbc");
        assert dd.delDel("abcdel").equals("abcdel");	
        assert dd.delDel("add").equals("add");	
        assert dd.delDel("ad").equals("ad");	
        assert dd.delDel("a").equals("a");	
        assert dd.delDel("").equals("");	
        assert dd.delDel("del").equals("del");	
        assert dd.delDel("adel").equals("a");	
        assert dd.delDel("aadelbb").equals("aadelbb");
        System.out.println("DelDel passed");
    }
    
}
