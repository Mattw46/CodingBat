/*
   makes10

   Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
 */

function makes10(a, b){
   if (a+b == 10 || (a == 10 | b ==10))
      return true;
   
   return false;
}

const assert = require('assert');
assert.equal(makes10(9, 10), true)
assert.equal(makes10(9, 9), false)
assert.equal(makes10(1, 9), true) 
assert.equal(makes10(10, 1), true)
assert.equal(makes10(10, 10), true)	
assert.equal(makes10(8, 2), true)
assert.equal(makes10(8, 3), false)	
assert.equal(makes10(10, 42), true)
assert.equal(makes10(12, -2), true)

console.log("All tests passed");