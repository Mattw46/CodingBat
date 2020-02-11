/* 
    lastDigit

    Given two non-negative int values, return true if they have the 
    same last digit, such as with 27 and 57. 
    Note that the % "mod" operator computes remainders, 
    so 17 % 10 is 7.
 */

 public class LastDigit {

    public static void main(String[] args) {
        LastDigit ld = new LastDigit();
        ld.test();
    }

    public boolean lastDigit(int a, int b) {
        if (a % 10 == b % 10) 
            return true;
        return false;
    }

    public void test() {
        assert lastDigit(7, 17) == true;
        assert lastDigit(6, 17) == false;
        assert lastDigit(3, 113) == true;
        assert lastDigit(114, 113) == false;	
        assert lastDigit(114, 4) == true;	
        assert lastDigit(10, 0) == true;	
        assert lastDigit(11, 0) == false;
        System.out.println("All tests passed");
    }
 }