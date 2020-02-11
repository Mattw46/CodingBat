#include <stdio.h>
#include <assert.h>

/* 
 * diff21
 *
 * Given an int n, return the absolute difference between n and 21, 
 * except return double the absolute difference if n is over 21.
*/

int diff21(int n) {
   if (n > 21)
      return abs(n -21) * 2;
   return abs(n - 21);
}

int main() {
   //printf("%d", diff21(22));
   assert(diff21(19) == 2);
   assert(diff21(10) == 11);
   assert(diff21(21) == 0);
   assert(diff21(22) == 2);	
   assert(diff21(25) == 8);
   assert(diff21(30) == 18);	
   assert(diff21(0) == 21);	
   assert(diff21(1) == 20);
   assert(diff21(2) == 19);
   assert(diff21(-1) == 22);
   assert(diff21(-2) == 23);
   assert(diff21(50) == 58);
   printf("All tests passed\n");
}