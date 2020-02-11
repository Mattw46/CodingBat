/*  SleepIn
    The parameter weekday is true if it is a weekday, 
    and the parameter vacation is true if we are on vacation. 
    We sleep in if it is not a weekday or we're on vacation. 
    Return true if we sleep in.*/
public class SleepIn {
    
    public static void main(String[] args) {
        SleepIn si = new SleepIn();
        si.test();
	}

    public boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) 
            return true;
        else    
            return false;
    }

    public void test() {
        assert sleepIn(false,false) == true;
        assert sleepIn(true, false) == false;
        assert sleepIn(false, true) == true;
        assert sleepIn(true, true) == true;
        System.out.println("All tests passed");
    }
}