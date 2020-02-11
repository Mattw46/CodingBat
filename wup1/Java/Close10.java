/*
 *   close10
 *
 * Given 2 int values, return whichever value is nearest 
 * to the value 10, or return 0 in the event of a tie. 
 * Note that Math.abs(n) returns the absolute value of a number.
*/
 
 public class Close10 {
     
    public static void main(String args[]) {
        Close10 c10 = new Close10();
        c10.test();
    }

    public int close10(int a, int b) {
        if (Math.abs(a - 10) == Math.abs(b - 10)) {
            return 0;
        }
        if (Math.abs(a - 10) < Math.abs(b - 10)) {
            return a;
        }
        return b;
    }

    public void test() {
        assert close10(8, 13) == 8;
        assert close10(13, 8) == 8;
        assert close10(13, 7) == 0;
        assert close10(7, 13) == 0;	
        assert close10(9, 13) == 9;	
        assert close10(13, 8) == 8;	
        assert close10(10, 12) == 10;	
        assert close10(11, 10) == 10;	
        assert close10(5, 21) == 5;	
        assert close10(0, 20) == 0;	
        assert close10(10, 10) == 0;
        System.out.println("All tests passed");
    }
 }