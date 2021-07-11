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

    @Test
    public void testNearHundred() throws Exception {
        assertTrue(wup1.nearHundred(93) == true);
        assertTrue(wup1.nearHundred(90) == true);
        assertTrue(wup1.nearHundred(89) == false);
        assertTrue(wup1.nearHundred(110) == true);
        assertTrue(wup1.nearHundred(111) == false);
        assertTrue(wup1.nearHundred(121) == false);
        assertTrue(wup1.nearHundred(-101) == false);
        assertTrue(wup1.nearHundred(-209) == false);
        assertTrue(wup1.nearHundred(190) == true);
        assertTrue(wup1.nearHundred(209) == true);
        assertTrue(wup1.nearHundred(0) == false);
        assertTrue(wup1.nearHundred(5) == false);
        assertTrue(wup1.nearHundred(-50) == false);
        assertTrue(wup1.nearHundred(191) == true);
        assertTrue(wup1.nearHundred(189) == false);
        assertTrue(wup1.nearHundred(200) == true);
        assertTrue(wup1.nearHundred(210) == true);
        assertTrue(wup1.nearHundred(211) == false);
        assertTrue(wup1.nearHundred(290) == false);
    }

    @Test
    public void missingChar() {
        assertTrue(wup1.missingChar("kitten", 1).equals("ktten"));
        assertTrue(wup1.missingChar("kitten", 0).equals("itten"));
        assertTrue(wup1.missingChar("kitten", 4).equals("kittn"));
        assertTrue(wup1.missingChar("Hi", 0).equals("i"));
        assertTrue(wup1.missingChar("Hi", 1).equals("H"));
        assertTrue(wup1.missingChar("code", 0).equals("ode"));
        assertTrue(wup1.missingChar("code", 1).equals("cde"));
        assertTrue(wup1.missingChar("code", 2).equals("coe"));
        assertTrue(wup1.missingChar("code", 3).equals("cod"));
        assertTrue(wup1.missingChar("chocolate", 8).equals("chocolat"));
    }

    @Test
    public void backAround() {
        assertTrue(wup1.backAround("cat").equals("tcatt"));
        assertTrue(wup1.backAround("Hello").equals("oHelloo"));
        assertTrue(wup1.backAround("a").equals("aaa"));
        assertTrue(wup1.backAround("abc").equals("cabcc"));
        assertTrue(wup1.backAround("read").equals("dreadd"));
        assertTrue(wup1.backAround("boo").equals("obooo"));
    }

    @Test
    public void startHi() {
        assertTrue(wup1.startHi("hi there") == true);
        assertTrue(wup1.startHi("hi") == true);
        assertTrue(wup1.startHi("hello hi") == false);
        assertTrue(wup1.startHi("he") == false);
        assertTrue(wup1.startHi("h") == false);
        assertTrue(wup1.startHi("") == false);
        assertTrue(wup1.startHi("ho hi") == false);
        assertTrue(wup1.startHi("hi ho") == true);
    }

    @Test
    public void hasTeen() {
        assertTrue(wup1.hasTeen(13, 20, 10) == true);
        assertTrue(wup1.hasTeen(20, 19, 10) == true);
        assertTrue(wup1.hasTeen(20, 10, 13) == true);
    }
}

