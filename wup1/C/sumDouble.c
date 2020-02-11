#include <stdio.h>
#include <assert.h>

/* 
 * sumDouble
 * 
 * Given two int values, return their sum. 
 * Unless the two values are the same, 
 * then return double their sum.
 * */

int sumDouble(int a, int b) {
   if (a==b)
      return (a+b) *2;

   return a + b;
}

int main() {
   assert(sumDouble(1, 2) == 3);
   assert(sumDouble(3, 2) == 5);
   assert(sumDouble(2, 2) == 8);
   assert(sumDouble(-1, 0) == -1);	
   assert(sumDouble(3, 3) == 12);
   assert(sumDouble(0, 0) == 0);	
   assert(sumDouble(0, 1) == 1);	
   assert(sumDouble(3, 4) == 7);
   printf("All tests passed\n");
}