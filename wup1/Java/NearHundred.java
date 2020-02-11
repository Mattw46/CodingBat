/*
   nearHundred

   Given an int n, return true if it is within 10 of 100 or 200. 
   Note: Math.abs(num) computes the absolute value of a number.
*/

public class NearHundred {
    
   public static void main(String[] args) {
      NearHundred nh = new NearHundred();
      nh.test();
	}

   public boolean nearHundred(int n) {
      if ((n >= 90 && n <= 110) || (n >= 190 && n <= 210))
         return true;

      return false;
   }

   public void test() {
      assert nearHundred(93) == true;
      assert nearHundred(90) == true;
      assert nearHundred(89) == false;
      assert nearHundred(110) == true;
      assert nearHundred(111) == false;
      assert nearHundred(121) == false;
      assert nearHundred(-101) == false;
      assert nearHundred(-209) == false;
      assert nearHundred(190) == true;
      assert nearHundred(209) == true;
      assert nearHundred(0) == false;
      assert nearHundred(5) == false;
      assert nearHundred(-50) == false;
      assert nearHundred(191) == true;
      assert nearHundred(189) == false;
      assert nearHundred(200) == true;
      assert nearHundred(210) == true;
      assert nearHundred(211) == false;
      assert nearHundred(290) == false;
      System.out.println("All tests passed");
   }
}