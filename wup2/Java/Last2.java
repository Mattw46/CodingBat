/*
    last2

    Given a string, return the count of the number of times 
    that a substring length 2 appears in the string and also 
    as the last 2 chars of the string, so "hixxxhi" yields 1 
    (we won't count the end substring).

last2("hixxhi") == 1
last2("xaxxaxaxx") == 1
last2("axxxaaxx") == 2
*/
class Last2 {

    public static void main(String[] args) {
        Last2 l2 = new Last2();
        l2.test();
    }

    public int last2(String str) {
        if (str.length() < 3) {
            return 0;
        }
        int count = 0;
        String end = str.substring(str.length() - 2, str.length());
        for (int i = 0; i < str.length() -2; i++) {
            if (str.substring(i,i+2).equals(end)) {
                count++;
            }
        }
        return count;
    }

    public void test() {
        assert last2("hixxhi") == 1;
        assert last2("xaxxaxaxx") == 1;
        assert last2("axxxaaxx") == 2;
        assert last2("xxaxxaxxaxx") == 3;	
        assert last2("xaxaxaxx") == 0;
        assert last2("xxxx") == 2;
        assert last2("13121312") == 1;	
        assert last2("11212") == 1;
        assert last2("13121311") == 0;
        assert last2("1717171") == 2;	
        assert last2("hi") == 0;
        assert last2("h") == 0;	
        assert last2("") == 0;
        System.out.println("All tests passed");
    }
}