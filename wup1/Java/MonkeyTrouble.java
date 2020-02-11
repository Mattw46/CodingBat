/* MonkeyTrouble
    We have two monkeys, a and b, and the parameters 
    aSmile and bSmile indicate if each is smiling. 
    We are in trouble if they are both smiling or 
    if neither of them is smiling. Return true if we are in trouble.*/
public class MonkeyTrouble {
    
    public static void main(String[] args) {
        MonkeyTrouble mt = new MonkeyTrouble();
        mt.test();
	}

    /* implement method here */
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        if ((aSmile && bSmile) || (!aSmile && !bSmile))
            return true;
        else 
            return false;
    }

    public void test() {
        assert monkeyTrouble(true, true) == true;
        assert monkeyTrouble(false, false) == true;
        assert monkeyTrouble(true, false) == false;
        assert monkeyTrouble(false, true) == false;
        System.out.println("All tests passed");
    }
}

