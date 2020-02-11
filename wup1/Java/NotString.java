/* 
   notString

   Given a string, return a new string where "not " has been added to the front. 
   However, if the string already begins with "not", return the string unchanged. 
   Note: use .equals() to compare 2 strings.

*/

public class NotString {
    
   public static void main(String[] args) {
      NotString ns = new NotString();
      ns.test();
	}

   public String notString(String str) {
      if (str.length() >= 3)
         if (str.substring(0, 3).equals("not"))
            return str;
            
      return "not " + str;
   }

   public void test() {
      assert notString("candy").equals("not candy");
      assert notString("x").equals("not x");
      assert notString("not bad").equals("not bad");
      assert notString("bad").equals("not bad");
      assert notString("not").equals("not");
      assert notString("is not").equals("not is not");
      assert notString("no").equals("not no");
      System.out.println("All tests passed");
   }
}

