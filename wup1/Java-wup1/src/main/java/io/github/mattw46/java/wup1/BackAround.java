/*
 * backAround
 *   
 * Given a string, take the last char and return 
 * a new string with the last char added at the 
 * front and back, so "cat" yields "tcatt". 
 * The original string will be length 1 or more.
 */
package io.github.mattw46.java.wup1;

/**
 *
 * @author Matt W
 */
public class BackAround {
    public String backAround(String str) {
      char last;
      if (str.length() > 1)
         last = str.charAt(str.length() -1);
      else
         last = str.charAt(0);

      return last + str + last;
    }
}
