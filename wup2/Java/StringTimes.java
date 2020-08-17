/*
    stringTimes

    Given a string and a non-negative int n, 
    return a larger string that is n copies of the original string.

    stringTimes("Hi", 2) → "HiHi"
    stringTimes("Hi", 3) → "HiHiHi"
    stringTimes("Hi", 1) → "Hi"
*/

public class StringTimes {

    public static void main(String[] args) {
        StringTimes st = new StringTimes();
        st.test();
	}

    public String stringTimes(String str, int n) {
        String newString = "";
        for (int i = 0; i < n; i++) {
            newString += str;
        }
        return newString;
    }

    public void test() {
        assert stringTimes("Hi", 2).equals("HiHi");
        assert stringTimes("Hi", 3).equals("HiHiHi");
        assert stringTimes("Hi", 1).equals("Hi");
        assert stringTimes("Hi", 0).equals("");	
        assert stringTimes("Hi", 5).equals("HiHiHiHiHi");	
        assert stringTimes("Oh Boy!", 2).equals("Oh Boy!Oh Boy!");	
        assert stringTimes("x", 4).equals("xxxx");	
        assert stringTimes("", 4).equals("");	
        assert stringTimes("code", 2).equals("codecode");	
        assert stringTimes("code", 3).equals("codecodecode");
        System.out.println("All tests passed");
    }
}