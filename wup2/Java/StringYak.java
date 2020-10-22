/*
    stringYak

    Suppose the string "yak" is unlucky. 
    Given a string, return a version where all the "yak" are removed, 
    but the "a" can be any char. The "yak" strings will not overlap.

    stringYak("yakpak") → "pak"
    stringYak("pakyak") → "pak"
    stringYak("yak123ya") → "123ya"
*/
class StringYak {

    public static void main(String[] args) {
        StringYak sy = new StringYak();
        sy.test();
    }

    public String stringYak(String str) {
        String yaklessString = "";
        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {              
                    i += 2;
            } else {
                yaklessString += str.charAt(i);
            }
        }
        return yaklessString;
    }

    public void test() {
        assert stringYak("yakpak").equals("pak");
        assert stringYak("pakyak").equals("pak");
        assert stringYak("yak123ya").equals("123ya");
        assert stringYak("yak").equals("");	
        assert stringYak("yakxxxyak").equals("xxx");
        assert stringYak("HiyakHi").equals("HiHi");	
        assert stringYak("xxxyakyyyakzzz").equals("xxxyyzzz");
        System.out.println("All test passed");
    }
}