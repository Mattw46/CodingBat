/* 
    hasTeen

    We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
    Given 3 int values, return true if 1 or more of them are teen.


*/

public class HasTeen {
    
    public static void main(String[] args) {
        HasTeen ht = new HasTeen();
        ht.test();
	}

    public boolean hasTeen(int a, int b, int c) {
        if (a >= 13 && a <= 19 || b >= 13 && b <= 19 || c >= 13 && c <= 19)
            return true;
        return false;
    }

    public void test() {
        assert hasTeen(13, 20, 10) == true;
        assert hasTeen(20, 19, 10) == true;
        assert hasTeen(20, 10, 13) == true;
        assert hasTeen(1, 20, 12) == false;
        assert hasTeen(19, 20, 12) == true;	
        assert hasTeen(12, 20, 19) == true;	
        assert hasTeen(12, 9, 20) == false;
        assert hasTeen(12, 18, 20) == true;	
        assert hasTeen(14, 2, 20) == true;	
        assert hasTeen(4, 2, 20) == false;
        assert hasTeen(11, 22, 22) == false;
        System.out.println("All tests passed");
    }
}

