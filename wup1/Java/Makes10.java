/*
   makes10

   Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
 */

public class Makes10 {
    
   public static void main(String[] args) {
      Makes10 m10 = new Makes10();
      m10.test();
	}

   public boolean makes10(int a, int b) {
      if ((a + b == 10) || (a == 10 || b == 10))
         return true;

      return false;
   }

   public void test() {
      assert makes10(9, 10) == true;
      assert makes10(9, 9) == false;
      assert makes10(1, 9) == true;
      assert makes10(10, 1) == true;	
      assert makes10(10, 10) == true;	
      assert makes10(8, 2) == true;	
      assert makes10(8, 3) == false;	
      assert makes10(10, 42) == true;	
      assert makes10(12, -2) == true;
      System.out.println("All tests passed");
   }
}

