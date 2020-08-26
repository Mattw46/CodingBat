/*
    nearHundred

    Given an int n, return true if it is within 10 of 100 or 200. 
    Note: Math.abs(num) computes the absolute value of a number.

*/

function nearHundred(n) {
    if (n >= 90 && n <= 110) {
        return true;
    } else if (n >= 190 && n <= 210) {
        return true;
    }
    else {
        return false;
    }
}

const assert = require('assert');
assert.equal(nearHundred(93), true);
assert.equal(nearHundred(90), true);
assert.equal(nearHundred(89), false);
assert.equal(nearHundred(110), true);	
assert.equal(nearHundred(111), false);	
assert.equal(nearHundred(121), false);	
assert.equal(nearHundred(0), false);	
assert.equal(nearHundred(5), false);
assert.equal(nearHundred(191), true);	
assert.equal(nearHundred(189), false);

console.log("All tests passed");