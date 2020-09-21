/*
    stringBits

    Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".

    stringBits("Hello").equals("Hlo"
    stringBits("Hi").equals("H"
    stringBits("Heeololeo").equals("Hello"
*/
class StringBits {

    public static void main(String[] args) {
        StringBits sb = new StringBits();
        sb.test();
    }

    public String stringBits(String str) {
        String newString = "";
        for (int i = 0; i < str.length(); i = i+2) {
            newString += str.charAt(i);
        }
        return newString;
    }

    public void test() { 
        assert stringBits("Hello").equals("Hlo");
        assert stringBits("Hi").equals("H");
        assert stringBits("Heeololeo").equals("Hello");
        assert stringBits("HiHiHi").equals("HHH");
        assert stringBits("").equals("");	
        assert stringBits("Greetings").equals("Getns");	
        assert stringBits("Chocoate").equals("Coot");
        assert stringBits("pi").equals("p");
        assert stringBits("Hello Kitten").equals("HloKte");
        assert stringBits("hxaxpxpxy").equals("happy");
        System.out.println("All tests passed");
    }
}