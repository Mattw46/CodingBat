#include <stdio.h>
#include <stdbool.h>
#include <assert.h>

/*
 * monkeyTrouble
 *
 * We have two monkeys, a and b, and the parameters aSmile and bSmile 
 * indicate if each is smiling. We are in trouble if they are both smiling 
 * or if neither of them is smiling. Return true if we are in trouble.
*/
bool monkeyTrouble(bool aSmile, bool bSmile) {
  return aSmile == bSmile;
}

int main() {
  assert(monkeyTrouble(true, true) == true);
  assert(monkeyTrouble(false, false) == true);
  assert(monkeyTrouble(true, false) == false);
  assert(monkeyTrouble(false, true) == false);
  printf("All tests passed\n");
}