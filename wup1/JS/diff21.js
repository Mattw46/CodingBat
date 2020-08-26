/*
    diff21

    Given an int n, return the absolute difference between n and 21, 
    except return double the absolute difference if n is over 21.

*/

function diff21(n){
  let diff = Math.abs(21 - n);
  if (n > 21) {
    diff = diff * 2;
  }
  return diff;
}

const assert = require('assert');
assert.equal(diff21(19), 2);
assert.equal(diff21(10), 11);
assert.equal(diff21(21), 0);
assert.equal(diff21(22), 2);	
assert.equal(diff21(25), 8);	
assert.equal(diff21(30), 18);	
assert.equal(diff21(0), 21);	
assert.equal(diff21(1), 20);	
assert.equal(diff21(2), 19);	
assert.equal(diff21(-1), 22);	
assert.equal(diff21(-2), 23);	
assert.equal(diff21(50), 58);

console.log("All tests passed");