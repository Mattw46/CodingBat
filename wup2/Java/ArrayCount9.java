/*
    arrayCount9

    Given an array of ints, return the number of 9's in the array.

    arrayCount9([1, 2, 9]) == 1
    arrayCount9([1, 9, 9]) == 2
    arrayCount9([1, 9, 9, 3, 9]) == 3
*/
class ArrayCount9 {

    public static void main(String[] args) {
        ArrayCount9 ac = new ArrayCount9();
        ac.test();
    }

    public int arrayCount9(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        return count;
    }

    public void test() {
        assert arrayCount9(new int[]{1, 2, 9}) == 1;
        assert arrayCount9(new int[]{1, 9, 9}) == 2;
        assert arrayCount9(new int[]{1, 9, 9, 3, 9}) == 3;
        assert arrayCount9(new int[]{1, 2, 3}) == 0;	
        assert arrayCount9(new int[]{}) == 0;	
        assert arrayCount9(new int[]{4, 2, 4, 3, 1}) == 0;	
        assert arrayCount9(new int[]{9, 2, 4, 3, 1}) == 1;
        System.out.println("All tests passed");
    }
}