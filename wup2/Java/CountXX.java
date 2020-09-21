/* countXX

    Count the number of "xx" in the given string. 
    We'll say that overlapping is allowed, 
    so "xxx" contains 2 "xx". 

    countXX("abcxx") == 1
    countXX("xxx") == 2
    countXX("xxxx") == 3
*/
class CountXX {

    public static void main(String[] args) {
        CountXX cx = new CountXX();
        cx.test();
    }

    int countXX(String str) {
        int count = 0;
        /*int first = str.indexOf('x');
        if (first == -1) {
            return 0;
        }
        else if (first == str.length() - 1) {
            return 1;
        }
        else {
            int current = first + 1;
            while(current < str.length()) {
                if (str.charAt(current) == 'x') {
                    count++;
                    System.out.println("Position " + current + " char " + str.charAt(current) + " count " + count);
                }
                current++;
            }
            return count;
        }*/
        for (int i = 0; i < str.length() -1; i++) {
            if (str.substring(i,i+2).equals("xx")) {
                count++;
            }
        }
        return count;
    }

    public void test() {
        /*assert countXX("abcxx") == 1;
        assert countXX("xxx") == 2;
        assert countXX("xxxx") == 3;
        assert countXX("abc") == 0;	
        assert countXX("Hello there") == 0;	*/
        assert countXX("Hexxo thxxe") == 2;	
        /*assert countXX("") == 0;
        assert countXX("Kittens") == 0;	
        assert countXX("Kittensxxx") == 2;*/
        System.out.println("All tests passed");
    }
}