/*
    arrayFront9

    Given an array of ints, return true if one of the first 4 elements in the array is a 9. 
    The array length may be less than 4.

    arrayFront9([1, 2, 9, 3, 4]) == true
    arrayFront9([1, 2, 3, 4, 9]) == false
    arrayFront9([1, 2, 3, 4, 5]) == false
*/

class ArrayFront9 {

    public static void main(String[] args) {
        ArrayFront9 af = new ArrayFront9();
        af.test();
    }

    public boolean arrayFront9(int[] nums) {
        int first = 4;
        if (nums.length < 4) 
            first = nums.length;
        for (int i = 0; i < first; i++) {
            if (nums[i] == 9) {
                return true;
            }
        }
        return false;
    }

    public void test() {
        assert arrayFront9(new int[]{1, 2, 9, 3, 4}) == true;
        assert arrayFront9(new int[]{1, 2, 3, 4, 9}) == false;
        assert arrayFront9(new int[]{1, 2, 3, 4, 5}) == false;
        assert arrayFront9(new int[]{9, 2, 3}) == true;	
        assert arrayFront9(new int[]{1, 9, 9}) == true;	
        assert arrayFront9(new int[]{1, 2, 3}) == false;
        assert arrayFront9(new int[]{1, 9}) == true;
        assert arrayFront9(new int[]{5, 5}) == false;
        assert arrayFront9(new int[]{2}) == false;
        assert arrayFront9(new int[]{9}) == true;
        assert arrayFront9(new int[]{}) == false;
        assert arrayFront9(new int[]{3, 9, 2, 3, 3}) == true;
        System.out.println("All test passed");
    }
}