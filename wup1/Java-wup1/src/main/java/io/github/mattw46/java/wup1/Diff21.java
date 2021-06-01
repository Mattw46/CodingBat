/*
 * diff21
    Given an int n, return the absolute difference between n and 21, 
    except return double the absolute difference if n is over 21.
 */
package io.github.mattw46.java.wup1;

/**
 *
 * @author Matt W
 */
public class Diff21 {
    
    public int diff21(int n) {
        if (n > 21)
            return Math.abs(n - 21) * 2;
        else
            return Math.abs(n - 21);
    }
}