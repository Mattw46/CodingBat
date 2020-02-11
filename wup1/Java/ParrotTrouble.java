/* Parrot Trouble
 * We have a loud talking parrot. 
 * The "hour" parameter is the current hour time in the range 0..23. 
 * We are in trouble if the parrot is talking and the hour is before 7 or after 20. 
 * Return true if we are in trouble.
*/

public class ParrotTrouble {
    
   public static void main(String[] args) {
      ParrotTrouble pt = new ParrotTrouble();
      pt.test();
	}

   public boolean parrotTrouble(boolean talking, int hour) {
      if (talking && (hour < 7 || hour > 20)) 
         return true;
      else
         return false;
   }

   public void test() {
      assert parrotTrouble(true, 6) == true;
      assert parrotTrouble(true, 7) == false;
      assert parrotTrouble(false, 6) == false;
      assert parrotTrouble(true, 21) == true;
      assert parrotTrouble(false, 21) == false;
      assert parrotTrouble(false, 20) == false;
      assert parrotTrouble(true, 23) == true;
      assert parrotTrouble(false, 23) == false;	
      assert parrotTrouble(true, 20) == false;	
      assert parrotTrouble(false, 12) == false;
      System.out.println("All tests passed");
    }
}

