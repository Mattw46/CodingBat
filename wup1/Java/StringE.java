/* 
    stringE

    Return true if the given string contains between 
    1 and 3 'e' chars.
*/

public class StringE {

    public static void main(String args[]) {
        StringE strE = new StringE();
        strE.test();
    }

    public boolean stringE(String str) {
        int eCount = 0;
        char[] letters = str.toCharArray();
        for (char c : letters) {
            if (c == 'e')
                eCount++; 
        }

        if (eCount >= 1 && eCount <= 3)
            return true;

        return false;
    }

    public void test() {
        assert stringE("Hello") == true;
        assert stringE("Heelle") == true;
        assert stringE("Heelele") == false;
        assert stringE("Hll") == false;
        assert stringE("e") == true;
        assert stringE("") == false;
        System.out.println("All tests passed");
    }
}