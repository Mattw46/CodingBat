/* 
    startHi

    Given a string, return true if the string starts with "hi" 
    and false otherwise.
*/

public class StartHi {
    
    public static void main(String[] args) {
        StartHi shi = new StartHi();
        shi.test();
	}

    public boolean startHi(String str) {
        if (str.length() < 2)
            return false;
        return str.substring(0, 2).equals("hi");
    }

    public void test() {
        assert startHi("hi there") == true;
        assert startHi("hi") == true;
        assert startHi("hello hi") == false;
        assert startHi("he") == false;	
        assert startHi("h") == false;	
        assert startHi("") == false;	
        assert startHi("ho hi") == false;	
        assert startHi("hi ho") == true;
        System.out.println("All tests passed");
    }
}

