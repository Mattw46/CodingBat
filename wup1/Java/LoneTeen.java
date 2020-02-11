/* 
    loneTeen    

    We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
    Given 2 int values, return true if one or the other is teen, but not both.

*/

public class LoneTeen {
    
    public static void main(String[] args) {
        LoneTeen lt = new LoneTeen();
        lt.test();
	}

    public boolean loneTeen(int a, int b) {
        if ((a >= 13 && a <= 19) ^ (b >= 13 && b <= 19))
            return true;
        return false;
    }

    public void test() {
        assert loneTeen(13, 99) == true;
        assert loneTeen(21, 19) == true;
        assert loneTeen(13, 13) == false;
        assert loneTeen(14, 20) == true;	
        assert loneTeen(20, 15) == true;
        assert loneTeen(16, 17) == false;	
        assert loneTeen(16, 9) == true;	
        assert loneTeen(16, 18) == false;	
        assert loneTeen(13, 19) == false;	
        assert loneTeen(13, 20) == true;	
        assert loneTeen(6, 18) == true;	
        assert loneTeen(99, 13) == true;	
        assert loneTeen(99, 99) == false;
        System.out.println("All tests passed");
    }
}

