/* 
    mixStart

    Return true if the given string begins with "mix", 
    except the 'm' can be anything, so "pix", "9ix" .. all count.
*/

public class MixStart {
    
    public static void main(String[] args) {
        MixStart ms = new MixStart();
        ms.test();
	}

    public boolean mixStart(String str) {
        if (str.length() >= 3 && str.charAt(1) == 'i' && 
            str.charAt(2) == 'x')
            return true;
        return false; 
    }

    public void test() {
        assert mixStart("mix snacks") == true;
        assert mixStart("pix snacks") == true;
        assert mixStart("piz snacks") == false;
        assert mixStart("nix") == true;		
        assert mixStart("ni") == false;	
        assert mixStart("n") == false;	
        assert mixStart("") == false;
        System.out.println("All tests passed");
    }
}

