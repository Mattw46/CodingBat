/*
    Warmup-1 > endUp

    Given a string, return a new string where the last 3 chars are 
    now in upper case. If the string has less than 3 chars, 
    uppercase whatever is there. Note that str.toUpperCase() 
    returns the uppercase version of a string.  
*/
public class EndUp {

    public static void main(String[] args) {
        EndUp eu = new EndUp();
        eu.test();
    }

    public String endUp(String str) {
        if (str.length() <= 3)
            return str.toUpperCase();
        
        String first = str.substring(0,str.length() - 3);
        return first + 
            str.substring(str.length() - 3, str.length()).toUpperCase();
    }

    public void test() {
        assert endUp("Hello").equals("HeLLO");
        assert endUp("hi there").equals("hi thERE");
        assert endUp("hi").equals("HI");
        assert endUp("woo hoo").equals("woo HOO");	
        assert endUp("xyz12").equals("xyZ12");	
        assert endUp("x").equals("X");	
        assert endUp("").equals("");
        System.out.println("All tests passed");
    }
}