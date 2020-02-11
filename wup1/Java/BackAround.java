/* 
   backAround
    
   Given a string, take the last char and return 
   a new string with the last char added at the 
   front and back, so "cat" yields "tcatt". 
   The original string will be length 1 or more.
*/

public class BackAround {
    
   public static void main(String[] args) {
      BackAround ba = new BackAround();
      ba.test();
	}

   public String backAround(String str) {
      char last;
      if (str.length() > 1)
         last = str.charAt(str.length() -1);
      else
         last = str.charAt(0);

      return last + str + last;
   }

   public void test() {
      assert backAround("cat").equals("tcatt");
      assert backAround("Hello").equals("oHelloo");
      assert backAround("a").equals("aaa");
      System.out.println("All tests passed");
    }
}

