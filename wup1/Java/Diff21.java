/* diff21
    Given an int n, return the absolute difference between n and 21, 
    except return double the absolute difference if n is over 21. 
*/

public class Diff21 {
    
    public static void main(String[] args) {
        Diff21 d21 = new Diff21();
        d21.test();
	}

    public int diff21(int n) {
        if (n > 21)
            return Math.abs(n - 21) * 2;
        else
            return Math.abs(n - 21);
    }

    public void test() {
        assert diff21(19) == 2;
        assert diff21(10) == 11;
        assert diff21(21) == 0;
        assert diff21(22) == 2;	
        assert diff21(25) == 8;
        assert diff21(30) == 18;
        assert diff21(0) == 21;
        assert diff21(1) == 20;
        assert diff21(2) == 19;
        assert diff21(-1) == 22;
        assert diff21(-2) == 23;
        assert diff21(50) == 58;
        System.out.println("All tests passed");
    }
}

