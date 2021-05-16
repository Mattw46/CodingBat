/*
Warmup-1 --

startHi

Given a string, return true if the string starts with 'hi'and false otherwise.

Examples

    startHi('hi there'),true
    startHi('hi'),true
    startHi('hello hi'),false
*/

function startHi(str){
  if (str.substring(0,2) === 'hi') {
   return true;
  }
  return false;
}

const assert = require('assert');
assert.equal(startHi('hi there'), true);
assert.equal(startHi('hi'), true);
assert.equal(startHi('hello hi'), false);
assert.equal(startHi('he'), false);	
assert.equal(startHi('h'), false);
assert.equal(startHi(''), false);
assert.equal(startHi('ho hi'), false);
assert.equal(startHi('hi ho'), true);
console.log("All tests passed");