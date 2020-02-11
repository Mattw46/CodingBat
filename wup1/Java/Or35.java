/* 
 * or35
 *
 * Return true if the given non-negative number is a multiple of 3 
 * or a multiple of 5. Use the % "mod" operator 
 */
class Or35 {

	public static void main(String args[]) {
		Or35 o35 = new Or35();
		o35.test();
	}

	public boolean or35(int n) {
		return n % 3 == 0 || n % 5 == 0;
	}

	public void test() {
		assert or35(3) == true;
		assert or35(10) == true;
		assert or35(8) == false;
		assert or35(15) == true;	
		assert or35(5) == true;	
		assert or35(9) == true;	
		assert or35(4) == false;	
		assert or35(7) == false;	
		assert or35(6) == true;	
		assert or35(17) == false;	
		assert or35(18) == true;	
		assert or35(29) == false;	
		assert or35(20) == true;	
		assert or35(21) == true;	
		assert or35(22) == false;	
		assert or35(45) == true;	
		assert or35(99) == true;	
		assert or35(100) == true;	
		assert or35(101) == false;	
		assert or35(121) == false;	
		assert or35(122) == false;	
		assert or35(123) == true;
		System.out.println("All tests passed");
	}
}
