/* 
    startOz

    Given a string, return a string made of the first 2 chars 
    (if present), however include first char only if it is 'o' 
    and include the second only if it is 'z', so "ozymandias" 
    yields "oz".
*/

public class StartOz {
    
    public static void main(String[] args) {
        StartOz so = new StartOz();
        so.test();
	}

    public String startOz(String str) {
        if (str.length() >= 2 && str.charAt(0) == 'o' && 
            str.charAt(1) == 'z')
            return str.substring(0,2); 
        else if (str.length() >= 1 && str.charAt(0) == 'o')
            return str.substring(0,1);
        else if (str.length() >= 1 && str.charAt(1) == 'z')
            return str.substring(1,2);
        else
            return "";
    }

    public void test() {
        assert startOz("ozymandias").equals("oz");
        assert startOz("bzoo").equals("z");
        assert startOz("oxx").equals("o");
        assert startOz("oz").equals("oz");	
        assert startOz("ounce").equals("o");	
        assert startOz("o").equals("o");
        assert startOz("abc").equals("");	
        assert startOz("").equals("");	
        assert startOz("zoo").equals("");	
        assert startOz("aztec").equals("z");	
        assert startOz("zzzz").equals("z");	
        assert startOz("oznic").equals("oz");
        System.out.println("All tests passed");
    }
}

