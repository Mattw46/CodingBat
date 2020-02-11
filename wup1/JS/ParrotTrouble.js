/* Parrot Trouble
 * We have a loud talking parrot. 
 * The "hour" parameter is the current hour time in the range 0..23. 
 * We are in trouble if the parrot is talking and the hour is before 7 or after 20. 
 * Return true if we are in trouble.
*/

function parrotTrouble(talking, hour){
   if (talking && (hour < 7 || hour > 20)) 
      return true;
   else
      return false;
}

const assert = require('assert');
assert.equal(parrotTrouble(true, 6), true);
assert.equal(parrotTrouble(true, 7), false);
assert.equal(parrotTrouble(false, 6), false);
assert.equal(parrotTrouble(true, 21), true);
assert.equal(parrotTrouble(false, 21), false);
assert.equal(parrotTrouble(false, 20), false);
assert.equal(parrotTrouble(true, 23), true);
assert.equal(parrotTrouble(false, 23), false);	
assert.equal(parrotTrouble(true, 20), false);	
assert.equal(parrotTrouble(false, 12), false);

console.log("All tests passed");