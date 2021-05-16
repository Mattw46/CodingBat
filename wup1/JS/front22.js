/* 
    Warmup-1 -- front22
    Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so 'kitten' yields 'kikittenki' chars are there.

    Examples

    front22('kitten'), 'kikittenki
    front22('Ha'), 'HaHaHa
    front22('abc'), 'ababcab
*/

function front22(str){
  return str.substring(0,2) + str + str.substring(0,2);
}

const assert = require('assert');
assert.equal(front22('kitten'), 'kikittenki');
assert.equal(front22('Ha'), 'HaHaHa');
assert.equal(front22('abc'), 'ababcab');
assert.equal(front22('ab'), 'ababab');	
assert.equal(front22('a'), 'aaa');	
assert.equal(front22(''), ''); 	
assert.equal(front22('Logic'), 'LoLogicLo');
console.log("All tests passed");