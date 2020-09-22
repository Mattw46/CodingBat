/*
    stringSplosion

    Given a non-empty string like "Code" return a string like "CCoCodCode".

    stringSplosion("Code").equals("CCoCodCode"
    stringSplosion("abc").equals("aababc"
    stringSplosion("ab").equals("aab"
*/
class StringSplosion {

    public static void main(String[] args) {
        StringSplosion ss = new StringSplosion();
        ss.test();
    }

    public String stringSplosion(String str) {
        String newString = "";
        for (int i = 0; i <= str.length(); i++) {
            for (int j = 0; j < i; j++) {
                newString += str.charAt(j);
            }
        }
        return newString;
    }

    public void test() {
        assert stringSplosion("Code").equals("CCoCodCode");
        assert stringSplosion("abc").equals("aababc");
        assert stringSplosion("ab").equals("aab");
        assert stringSplosion("x").equals("x");
        assert stringSplosion("fade").equals("ffafadfade");
        assert stringSplosion("There").equals("TThTheTherThere");	
        assert stringSplosion("Kitten").equals("KKiKitKittKitteKitten");
        assert stringSplosion("Bye").equals("BByBye");
        assert stringSplosion("Good").equals("GGoGooGood");
        assert stringSplosion("Bad").equals("BBaBad");
        System.out.println("All tests passed");
    }
}