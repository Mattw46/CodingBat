/*
    in3050

    Given 2 int values, return true if they are both in the 
    range 30..40 inclusive, or they are both in the 
    range 40..50 inclusive.
*/

public class In3050 {
    
    public static void main(String args[]) {
        In3050 i35 = new In3050();
        i35.test();
    }

    public boolean in3050(int a, int b) {
        return ((a >= 30 && a <= 40) && (b >= 30 && b  <= 40))
                || ((a >= 40 && a <= 50) && (b >= 40 && b  <= 50));
    }

    public void test() {
        assert in3050(30, 31) == true;
        assert in3050(30, 41) == false;
        assert in3050(40, 50) == true;
        assert in3050(40, 51) == false;	
        assert in3050(39, 50) == false;
        assert in3050(50, 39) == false;	
        assert in3050(40, 39) == true;
        assert in3050(49, 48) == true;	
        assert in3050(50, 40) == true;	
        assert in3050(50, 51) == false;	
        assert in3050(35, 36) == true;	
        assert in3050(35, 45) == false;
        System.out.println("All tests passed");
    }
}