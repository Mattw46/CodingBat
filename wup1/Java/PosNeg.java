/* 
   PosNeg

   Given 2 int values, return true if one is negative and one is positive. 
   Except if the parameter "negative" is true, then return true only if 
   both are negative.
*/

public class PosNeg {
    
   public static void main(String[] args) {
      PosNeg pn = new PosNeg();
      pn.test();
	}

   public boolean posNeg(int a, int b, boolean negative) {
      if (negative)
         return (a < 0 && b < 0);
      
      return (a < 0 ^ b< 0);
   }

   public void test() {
      assert posNeg(1, -1, false) == true;
      assert posNeg(-1, 1, false) == true;
      assert posNeg(-4, -5, true) == true;
      assert posNeg(-4, -5, false) == false;
      assert posNeg(-4, 5, false) == true;	
      assert posNeg(-4, 5, true) == false;
      assert posNeg(1, 1, false) == false;
      assert posNeg(-1, -1, false) == false;
      assert posNeg(1, -1, true) == false;
      assert posNeg(-1, 1, true) == false;
      assert posNeg(1, 1, true) == false;
      assert posNeg(-1, -1, true) == true;	
      assert posNeg(5, -5, false) == true;	
      assert posNeg(-6, 6, false) == true;	
      assert posNeg(-5, -6, false) == false;
      assert posNeg(-2, -1, false) == false;
      assert posNeg(1, 2, false) == false;
      assert posNeg(-5, 6, true) == false;
      assert posNeg(-5, -5, true) == true;
      System.out.println("All tests passed");
   }
}

