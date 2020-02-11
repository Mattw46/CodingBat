/* sumDouble 
    Given two int values, return their sum. Unless the two values are the same, 
    then return double their sum. */
public class sumDouble {
    
    public static void main(String[] args) {
        sumDouble sd = new sumDouble();
        sd.test();
	}

    public int sumDouble(int a, int b) {
        if (a == b)
            return (a + b) * 2; 

        return a + b;
    }

    public void test() {
        assert sumDouble(1, 2) == 3;
        assert sumDouble(3, 2) == 5;
        assert sumDouble(2, 2) == 8;
        assert sumDouble(-1, 0) == -1;	
        assert sumDouble(3, 3) == 12;
        assert sumDouble(0, 0) == 0;	
        assert sumDouble(0, 1) == 1;	
        assert sumDouble(3, 4) == 7;
        System.out.println("All tests passed");
    }
}

