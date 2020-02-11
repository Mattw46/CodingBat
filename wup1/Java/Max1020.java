import javax.lang.model.util.ElementScanner6;

/* 
    max1020

    Given 2 positive int values, return the larger value that 
    is in the range 10..20 inclusive, or return 0 if neither is 
    in that range.
*/

public class Max1020 {

    public static void main(String args[]) {
        Max1020 m12 = new Max1020();
        m12.test();
    }

    public int max1020(int a, int b) {
        if (!(a >= 10 && a <= 20) && !(b >= 10 && b <= 20)) {
            return 0;
        }
        if ((a >= 10 && a <= 20) && (b >= 10 && b <= 20)) {
            if ( a > b) 
                return a;
            else
                return b;
        }
        if ((a >= 10 && a <= 20)) 
            return a;
        else
            return b;
        
    }

    public void test() {
        assert max1020(11, 19) == 19;
        assert max1020(19, 11) == 19;
        assert max1020(11, 9) == 11;
        assert max1020(9, 21) == 0;	
        assert max1020(10, 21) == 10;	
        assert max1020(21, 10) == 10;	
        assert max1020(9, 11) == 11;	
        assert max1020(23, 10) == 10;	
        assert max1020(20, 10) == 20;	
        assert max1020(7, 20) == 20;	
        assert max1020(17, 16) == 17;
        System.out.println("All tests passed");
    }
}