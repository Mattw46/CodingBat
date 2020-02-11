/* 
    front3

    Given a string, we'll say that the front is the first 3 chars of the string. 
    If the string length is less than 3, the front is whatever is there. 
    Return a new string which is 3 copies of the front.


*/

public class Front3 {
    
    public static void main(String[] args) {
        Front3 f3 = new Front3();
        f3.test();
	}

    public String front3(String str) {
        if (str.length() > 3)
            return str.substring(0,3) + str.substring(0,3) + 
                str.substring(0,3);
        else
            return str + str + str;
    }

    public void test() {
        assert front3("Java").equals("JavJavJav");
        assert front3("Chocolate").equals("ChoChoCho");
        assert front3("abc").equals("abcabcabc");
        assert front3("abcXYZ").equals("abcabcabc");
        assert front3("ab").equals("ababab");
        assert front3("a").equals("aaa");
        assert front3("").equals("");
        System.out.println("All tests passed");
    }
}

