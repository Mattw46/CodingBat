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
        //TODO: Test goes here...
        assertTrue(wup1.sleepIn(false, false));
        assertFalse(wup1.sleepIn(true, false));
        assertTrue(wup1.sleepIn(false, true));
        assertTrue(wup1.sleepIn(true, true));
    }


}

