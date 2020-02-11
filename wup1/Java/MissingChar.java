/* 
   missingChar

   Given a non-empty string and an int n, 
   return a new string where the char at index n has been removed. 
   The value of n will be a valid index of a char in the original 
   string (i.e. n will be in the range 0..str.length()-1 inclusive).
*/

public class MissingChar {
    
   public static void main(String[] args) {
      MissingChar mc = new MissingChar();
      mc.test();
      //System.out.println(mc.missingChar("kitten", 1));
	}

   public String missingChar(String str, int n) {
      return str.substring(0,n) + str.substring(n + 1,str.length());
   }

   public void test() {
      assert missingChar("kitten", 1).equals("ktten");
      assert missingChar("kitten", 0).equals("itten");
      assert missingChar("kitten", 4).equals("kittn");
      assert missingChar("Hi", 0).equals("i");	
      assert missingChar("Hi", 1).equals("H");
      assert missingChar("code", 0).equals("ode");
      assert missingChar("code", 1).equals("cde");	
      assert missingChar("code", 2).equals("coe");
      assert missingChar("code", 3).equals("cod");	
      assert missingChar("chocolate", 8).equals("chocolat");
      System.out.println("All tests passed");
    }
}

