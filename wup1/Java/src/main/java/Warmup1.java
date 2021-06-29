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
}
