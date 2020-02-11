/*
    everyNth

    Given a non-empty string and an int N, return the string made 
    starting with char 0, and then every Nth char of the string. 
    So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.

    
*/
public class EveryNth{

    public static void main(String[] args) {
        EveryNth en = new EveryNth();
        en.test();
    }

    public String everyNth(String str, int n) {
        String newString = "";
        for (int i = 0; i < str.length(); i += n) {
            newString += str.charAt(i) + "";
        }
        return newString;
    }

    public void test() {
        assert everyNth("Miracle", 2).equals("Mrce");
        assert everyNth("abcdefg", 2).equals("aceg");
        assert everyNth("abcdefg", 3).equals("adg");
        assert everyNth("Chocolate", 3).equals("Cca");	
        assert everyNth("Chocolates", 3).equals("Ccas");	
        assert everyNth("Chocolates", 4).equals("Coe");	
        assert everyNth("Chocolates", 100).equals("C");
        System.out.println("All tests passed");
    }
}