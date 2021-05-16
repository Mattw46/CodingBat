/*
Warmup-1 --

icyHot

Given two temperatures, return true if one is less than 0 and the other is greater than 100.

Examples

    icyHot(120, -1),true
    icyHot(-1, 120),true
    icyHot(2, 120),false
*/

function icyHot(temp1, temp2){
  if ((temp1 < 0 && temp2 > 100) || (temp1 > 100 && temp2 < 0)) {
   return true;
  }
  return false;
}

const assert = require('assert');
assert.equal(icyHot(120, -1),true);
assert.equal(icyHot(-1, 120),true);
assert.equal(icyHot(2, 120),false);
assert.equal(icyHot(-1, 100), false);
assert.equal(icyHot(-2, 120), true);
assert.equal(icyHot(120, 120), false);
console.log("All tests passed");