/* sumDouble 
    Given two int values, return their sum. Unless the two values are the same, 
    then return double their sum. */

function sumDouble(a, b){
  if (a === b)
    return (a+b) * 2;
  else
    return a+b;
}

const assert = require('assert');
assert.equal(sumDouble(1, 2), 3);
assert.equal(sumDouble(3, 2), 5);
assert.equal(sumDouble(2, 2), 8);
assert.equal(sumDouble(-1, 0), -1);
assert.equal(sumDouble(3, 3), 12);
assert.equal(sumDouble(0, 0), 0);
assert.equal(sumDouble(0, 1), 1);
assert.equal(sumDouble(3, 4), 7);

console.log("All tests passed");