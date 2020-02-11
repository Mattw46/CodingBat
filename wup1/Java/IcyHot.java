/* 
    icyHot

    Given two temperatures, 
    return true if one is less than 0 and the other is greater than 100.

*/

public class IcyHot {
    
    public static void main(String[] args) {
        IcyHot ih = new IcyHot();
        ih.test();
	}

    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0);
    }

    public void test() {
        assert icyHot(120, -1) == true;
        assert icyHot(-1, 120) == true;
        assert icyHot(2, 120) == false;
        assert icyHot(-1, 100) == false;	
        assert icyHot(-2, -2) == false;	
        assert icyHot(120, 120) == false;
        System.out.println("All tests passed");
    }
}

