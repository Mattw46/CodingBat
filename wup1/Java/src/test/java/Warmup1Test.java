//package test;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Warmup1 Tester.
 *
 * @author <Authors name>
 * @since <pre>Jun. 29, 2021</pre>
 * @version 1.0
 */
public class Warmup1Test {
    Warmup1 wup1 = new Warmup1();

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     *
     * Method: sleepIn(boolean weekday, boolean vacation)
     *
     */
    @Test
    public void testSleepIn() throws Exception {
        assertTrue(wup1.sleepIn(false, false));
        assertFalse(wup1.sleepIn(true, false));
        assertTrue(wup1.sleepIn(false, true));
        assertTrue(wup1.sleepIn(true, true));
    }

    @Test
    public void testDiff21() throws Exception {
        assertTrue(wup1.diff21(19) == 2);
        assertTrue(wup1.diff21(10) == 11);
        assertTrue(wup1.diff21(21) == 0);
        assertTrue(wup1.diff21(25) == 8);
        assertTrue(wup1.diff21(30) == 18);
        assertTrue(wup1.diff21(0) == 21);
        assertTrue(wup1.diff21(1) == 20);
        assertTrue(wup1.diff21(2) == 19);
        assertTrue(wup1.diff21(-1) == 22);
        assertTrue(wup1.diff21(-2) == 23);
        assertTrue(wup1.diff21(50) == 58);
    }
}

