/* 
    delDel

    Given a string, if the string "del" appears starting at index 1, 
    return a string where that "del" has been deleted. Otherwise, return the string unchanged.

*/

public class DelDel {
    
    public static void main(String[] args) {
        DelDel dd = new DelDel();
        dd.test();
	}

    public String delDel(String str) {
        if (str.length() > 3)
            if (str.charAt(1) == 'd' && str.charAt(2) == 'e' && str.charAt(3) == 'l')
                return str.charAt(0) + str.substring(4, str.length());

        return str;
    }

    public void test() {
        assert delDel("adelbc").equals("abc");
        assert delDel("adelHello").equals("aHello");
        assert delDel("adedbc").equals("adedbc");
        assert delDel("abcdel").equals("abcdel");	
        assert delDel("add").equals("add");	
        assert delDel("ad").equals("ad");	
        assert delDel("a").equals("a");	
        assert delDel("").equals("");	
        assert delDel("del").equals("del");	
        assert delDel("adel").equals("a");	
        assert delDel("aadelbb").equals("aadelbb");
        System.out.println("All tests passed");
    }
}

