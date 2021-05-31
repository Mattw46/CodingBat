/*
 * CodingBat Java Test 
 * 
 * Testing BackAround
 */

import io.github.mattw46.java.wup1.BackAround;
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
    public void testOne() {
      assert BA.backAround("cat").equals("tcatt");
      assert BA.backAround("Hello").equals("oHelloo");
      assert BA.backAround("a").equals("aaa");
      System.out.println("All tests passed");
    }
}
