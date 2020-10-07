/*
    array123

    Given an array of ints, return true if the sequence of numbers 1, 2, 3 
    appears in the array somewhere.

    array123([1, 1, 2, 3, 1]) == true
    array123([1, 1, 2, 4, 1]) == false
    array123([1, 1, 2, 1, 2, 3]) == true
*/
class Array123 {

    public static void main(String[] args) {
        Array123 a = new Array123();
        a.test();
    }

    public boolean array123(int[] nums) {
        if (nums.length >= 3) {
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] == 1 && nums[i+1] == 2 && nums[i+2] == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public void test() {
        assert array123(new int[]{1, 1, 2, 3, 1}) == true;
        assert array123(new int[]{1, 1, 2, 4, 1}) == false;
        assert array123(new int[]{1, 1, 2, 1, 2, 3}) == true;
        assert array123(new int[]{1, 1, 2, 1, 2, 1}) == false;
        assert array123(new int[]{1, 2, 3, 1, 2, 3}) == true;	
        assert array123(new int[]{1, 2, 3}) == true;
        assert array123(new int[]{1, 1, 1}) == false;
        assert array123(new int[]{1, 2}) == false;	
        assert array123(new int[]{1}) == false;	
        assert array123(new int[]{}) == false;
        System.out.println("All test passed");
    }
}