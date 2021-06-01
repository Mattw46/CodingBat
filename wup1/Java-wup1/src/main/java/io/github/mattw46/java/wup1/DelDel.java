/*
 * delDel

    Given a string, if the string "del" appears starting at index 1, 
    return a string where that "del" has been deleted. Otherwise, return the string unchanged.
 */
package io.github.mattw46.java.wup1;

/**
 *
 * @author Matt W
 */
public class DelDel {
    
    public String delDel(String str) {
        if (str.length() > 3) {
            if (str.charAt(1) == 'd' && str.charAt(2) == 'e' 
                    && str.charAt(3) == 'l') {
                return str.charAt(0) + str.substring(4, str.length());
            }
        }
        return str;
    }
}
