/*
 * CodingBat Java Test 
 * 
 * Testing BackAround
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
public class TestBackAround {
    BackAround BA;
    
    public TestBackAround() {
        BA = new BackAround();
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testBackAround() {
        System.out.println("Testing BackAround");
        assert BA.backAround("cat").equals("tcatt");
        assert BA.backAround("Hello").equals("oHelloo");
        assert BA.backAround("a").equals("aaa");
        System.out.println("BackAround passed");
    }
}
