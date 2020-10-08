/*
    stringMatch

    Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. 
    So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.

    stringMatch("xxcaazz", "xxbaaz") == 3
    stringMatch("abc", "abc") == 2
    stringMatch("abc", "axc") == 0
*/
class StringMatch {

    public static void main(String[] args) {
        StringMatch sm = new StringMatch();
        sm.test();
    }

    public int stringMatch(String a, String b) {
        int count = 0; 
        int shortestLength = a.length();
        if (b.length() < a.length()) {
            shortestLength = b.length();
        }
        for (int i = 0; i < shortestLength -1; i++) {
            if (a.substring(i,i +2).equals(b.substring(i,i +2))) {
                count++;
            }
        }
        return count;
    }

    public void test() {
        assert stringMatch("xxcaazz", "xxbaaz") == 3;
        assert stringMatch("abc", "abc") == 2;
        assert stringMatch("abc", "axc") == 0;
        assert stringMatch("hello", "he") == 1;	
        assert stringMatch("he", "hello") == 1;
        assert stringMatch("h", "hello") == 0;
        assert stringMatch("", "hello") == 0;	
        assert stringMatch("aabbccdd", "abbbxxd") == 1;	
        assert stringMatch("aaxxaaxx", "iaxxai") == 3;	
        assert stringMatch("iaxxai", "aaxxaaxx") == 3;
        System.out.println("All test passed");
    }
}