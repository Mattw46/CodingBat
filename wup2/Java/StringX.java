/*
    stringX

    Given a string, return a version where all the "x" have been removed. 
    Except an "x" at the very start or end should not be removed.

    stringX("xxHxix").equals("xHix"
    stringX("abxxxcd").equals("abcd"
    stringX("xabxxxcdx").equals("xabcdx"
*/
class StringX {
    
    public static void main(String[] args) {
        StringX sx = new StringX();
        sx.test();
    }

    public String stringX(String str) {
        String noX = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || i == str.length() -1) {
                noX += str.charAt(i);
            } else if (str.charAt(i) != 'x') {
                noX += str.charAt(i);
            }
        }
        return noX;
    }

    public void test() {
        assert stringX("xxHxix").equals("xHix");
        assert stringX("abxxxcd").equals("abcd");
        assert stringX("xabxxxcdx").equals("xabcdx");
        assert stringX("xKittenx").equals("xKittenx");
        assert stringX("Hello").equals("Hello");
        assert stringX("xx").equals("xx");
        assert stringX("x").equals("x");
        assert stringX("").equals("");
        System.out.println("All test passed");
    }
}