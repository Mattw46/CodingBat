/*
Warmup-1 --

front3

Given a string, we'll say that the front is the first 3 chars of the string. 
If the string length is less than 3, the front is whatever is there. 
Return a new string which is 3 copies of the front.

Examples

    front3('Java') → JavJavJav
    front3('Chocolate') → ChoChoCho
    front3('abc') → abcabcabc
*/

function front3(str){
  if (str.length === 3) {
    return str + str + str;
  }
  let first = str.substring(0,3);
  return first + first + first;
}

const assert = require('assert');
assert.equal(front3('Java'), 'JavJavJav');
assert.equal(front3('Chocolate'), 'ChoChoCho');
assert.equal(front3('abc'), 'abcabcabc');
assert.equal(front3('abcXYZ'), 'abcabcabc');
assert.equal(front3('ab'), 'ababab');
assert.equal(front3('a'), 'aaa');
assert.equal(front3(''), '');
console.log("All tests passed");
