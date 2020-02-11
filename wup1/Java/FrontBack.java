/* 
    TfrontBack
    
    Given a string, return a new string where the first and last chars have been exchanged.
*/

public class FrontBack {
    
    public static void main(String[] args) {
        FrontBack fb = new FrontBack();
        fb.test();
	}

    public String frontBack(String str) {
        if (str.length() <= 1)
            return str;

        return str.substring(str.length() -1) + str.substring(1,str.length() -1) +
            str.substring(0,1);
    }

    public void test() {
        assert frontBack("code").equals("eodc");
        assert frontBack("a").equals("a");
        assert frontBack("ab").equals("ba");
        assert frontBack("abc").equals("cba");	
        assert frontBack("").equals("");	
        assert frontBack("Chocolate").equals("ehocolatC");	
        assert frontBack("aavJ").equals("Java");	
        assert frontBack("hello").equals("oellh");
        System.out.println("All tests passed");
    }
}

