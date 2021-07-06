public class Warmup1 {

    /*
    * The parameter weekday is true if it is a weekday, and the parameter vacation
    * is true if we are on vacation. We sleep in if it is not a weekday or we're on vacation.
    * Return true if we sleep in.
    */
    public boolean sleepIn(boolean weekday, boolean vacation) {
        
        return !(weekday == true && vacation == false);
    }

    /*
    * Given an int n, return the absolute difference between n and 21,
    * except return double the absolute difference if n is over 21.
    */
    public int diff21(int n) {
        if (n > 21) {
            return Math.abs(n - 21) * 2;
        }
        return Math.abs(n - 21);
    }

    /*
    * Given an int n, return true if it is within 10 of 100 or 200.
    * Note: Math.abs(num) computes the absolute value of a number.
    * */
    public boolean nearHundred(int n) {
        if ((n >= 90 && n <= 110) || (n >= 190 && n <= 210)) {
            return true;
        }
        return false;
    }

    /*
    * Given a non-empty string and an int n,
    * return a new string where the char at index n has been removed.
    * The value of n will be a valid index of a char in the original
    * string (i.e. n will be in the range 0..str.length()-1 inclusive).
    */
    public String missingChar(String str, int n) {
        return str.substring(0,n) + str.substring(n+1,str.length());
    }
}
