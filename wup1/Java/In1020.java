/* 
    Warmup-1 > in1020

    Given 2 int values, return true if either of them is in the range 10..20 inclusive.
*/

public class In1020 {
    
    public static void main(String[] args) {
        In1020 in1020 = new In1020();
        in1020.test();
	}

    public boolean in1020(int a, int b) {
        return (a >= 10 && a <= 20) || (b >= 10 && b <= 20);
    }

    public void test() {
        assert in1020(12, 99) == true;
        assert in1020(21, 12) == true;
        assert in1020(8, 99) == false;
        assert in1020(99, 10) == true;	
        assert in1020(20, 20) == true;	
        assert in1020(21, 21) == false;	
        assert in1020(9, 9) == false;
        System.out.println("All tests passed");
    }
}

