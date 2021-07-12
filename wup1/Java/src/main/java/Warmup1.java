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
    
    /*
    * Given a string, take the last char and return a new string with
    * the last char added at the front and back, so "cat" yields "tcatt".
    * The original string will be length 1 or more.
    */
    public String backAround(String str) {
        return str.charAt(str.length() -1) + str + str.charAt(str.length() -1);
    }

    /* Given a string, return true if the string starts with "hi" and false otherwise. */
    public boolean startHi(String str) {
        if (str.length() >= 2 && str.substring(0,2).equals("hi")) {
            return true;
        }
        return false;
    }

    /*
    * We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    * Given 3 int values, return true if 1 or more of them are teen.
    */
    public boolean hasTeen(int a, int b, int c) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19) || (c >= 13 && c <= 19)) {
            return true;
        }
        return false;
    }

    /*
     * Return true if the given string begins with "mix",
     * except the 'm' can be anything, so "pix", "9ix" .. all count.
     */
    public boolean mixStart(String str) {
        if(str.length() >= 3 && str.substring(1,3).equals("ix")) {
            return true;
        }
        return false;
    }

    /*
    * Given 2 int values, return whichever value is nearest to the value 10,
    * or return 0 in the event of a tie. Note that Math.abs(n)
    * returns the absolute value of a number.
    */
    public int close10(int a, int b) {
        if(Math.abs(a - 10) == Math.abs(b - 10)) {
            return 0;
        }
        if (Math.abs(a - 10) < Math.abs(b - 10)) {
            return a;
        }
        return b;
    }
}
