/*
    Warmup-1 -- or35
    Return true if the given non-negative number is a multiple of 3 or a multiple of 5. 
    (Hint: Use the % 'mod' operator)

    Examples

    or35(3),(true
    or35(10),(true
    or35(8),(false
*/


function or35(n){
  if (n % 3 === 0 || n % 5 === 0) {
      return true;
  }
  return false;
}

const assert = require('assert');
assert.equal(or35(3),true);
assert.equal(or35(10), true);
assert.equal(or35(8),false);
assert.equal(or35(15),(true));	
assert.equal(or35(5),(true));	
assert.equal(or35(4),(false));	
assert.equal(or35(9),(true));	
assert.equal(or35(4),(false));	
assert.equal(or35(7),(false));	
assert.equal(or35(6),(true));	
assert.equal(or35(17),(false));	
assert.equal(or35(18),(true));	
assert.equal(or35(29),(false));	
assert.equal(or35(20),(true));	
assert.equal(or35(21),(true));	
assert.equal(or35(22),(false));	
assert.equal(or35(45),(true));	
assert.equal(or35(99),(true));	
assert.equal(or35(100),(true));	
assert.equal(or35(101),(false));	
assert.equal(or35(121),(false));	
assert.equal(or35(122),(false));	
assert.equal(or35(123),(true));
console.log("All tests passed");