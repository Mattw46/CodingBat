/*
    altPairs

    Given a string, return a string made of the chars at 
    indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".

    altPairs("kitten") → "kien"
    altPairs("Chocolate") → "Chole"
    altPairs("CodingHorror") → "Congrr"
 */
class AltPairs {

    public static void main(String[] args) {
        AltPairs ap = new AltPairs();
        ap.test();
    }

    public String altPairs(String str) {
        int pairCount = 0;
        String returnString = "";
        for (int i = 0; i < str.length(); i++) {
            if (pairCount == 0) {
                returnString += str.charAt(i);
                pairCount++;
            } 
            else if (pairCount == 1) {
                returnString += str.charAt(i);
                pairCount = 0;
                i += 2;
            }
        }
        return returnString;
    }

    public void test() {
        assert altPairs("kitten").equals("kien");
        assert altPairs("Chocolate").equals("Chole");
        assert altPairs("CodingHorror").equals("Congrr");
        assert altPairs("yak").equals("ya");
        assert altPairs("ya").equals("ya");	
        assert altPairs("y").equals("y");	
        assert altPairs("").equals("");	
        assert altPairs("ThisThatTheOther").equals("ThThThth");
        System.out.println("All test passed");
    }
}