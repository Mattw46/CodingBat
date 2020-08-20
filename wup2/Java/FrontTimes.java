/*
   frontTimes

   Given a string and a non-negative int n, 
   we'll say that the front of the string is the first 3 chars, 
   or whatever is there if the string is less than length 3. 
   Return n copies of the front;

   frontTimes("Chocolate", 2) → "ChoCho"
   frontTimes("Chocolate", 3) → "ChoChoCho"
   frontTimes("Abc", 3) → "AbcAbcAbc"
*/
public class FrontTimes {
   public static void main(String[] args) {
      FrontTimes ft = new FrontTimes();
      ft.test();
   }

   public String frontTimes(String str, int n) {
      String front;
      if (str.length() < 3) {
         front = str;
      } else {
         front = str.substring(0,2);
      }
      String newString = "";
      for (int i = 0; i < n; i++) {
         newString += front;
      }
      return newString;
   }

   public void test() {
      assert frontTimes("Chocolate", 2).equals("ChoCho");
      assert frontTimes("Chocolate", 3).equals("ChoChoCho");
      assert frontTimes("Abc", 3).equals("AbcAbcAbc");
      assert frontTimes("Ab", 4).equals("AbAbAbAb");
      assert frontTimes("A", 4).equals("AAAA");
      assert frontTimes("", 4).equals("");
      assert frontTimes("Abc", 0).equals("");
      System.out.println("All tests passed");
   }
}