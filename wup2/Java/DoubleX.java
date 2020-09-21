/*
doubleX

Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".

doubleX("axxbb") == true
doubleX("axaxax") == false
doubleX("xxxxx") == true
*/
class DoubleX {
    

    public static void main(String[] args) {
        DoubleX dx = new DoubleX();
        dx.test();
    }

    boolean doubleX(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x' && str.charAt(i + 1) == 'x') {
                return true;
            }
            else if (str.charAt(i) == 'x' && str.charAt(i + 1) != 'x') {
                return false;
            }
        }
        return false;
    }

    public void test() {
        assert doubleX("axxbb") == true;
        assert doubleX("axaxax") == false;
        assert doubleX("xxxxx") == true;
        assert doubleX("xaxxx") == false;
        assert doubleX("aaaax") == false;
        assert doubleX("") == false;	
        assert doubleX("abc") == false;	
        assert doubleX("x") == false;	
        assert doubleX("xx") == true;	
        assert doubleX("xax") == false;
        assert doubleX("xaxx") == false;
        System.out.println("All tests passed");
    }
}