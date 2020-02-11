#include <stdio.h>
#include <stdbool.h>
#include <assert.h>

/* 
 * sleepIn
 * The parameter weekday is true if it is a weekday, 
 * and the parameter vacation is true if we are on vacation. 
 * We sleep in if it is not a weekday or we're on vacation. 
 * Return true if we sleep in.
 */
bool sleepIn(bool weekday, bool vacation) {
  return (weekday && vacation) || !weekday;
}

int main() {
  assert(sleepIn(false, false) == true);
  assert(sleepIn(true, false) == false);
  assert(sleepIn(false, true) == true);
  assert(sleepIn(true, true) == true);
  printf("All tests passed\n");
}

