/*
   Warmup-1 -- backAround
   Given a string, take the last char and return a new string 
   with the last char added at the front and back, so 'cat' yields 
   'tcatt' The original string will be length 1 or more.

   Examples

   backAround('cat') → tcatt
   backAround('Hello') → oHelloo
   backAround('a') → aaa
*/

function backAround(str){
  if (str.length === 0) { return str; }
  return str[str.length -1] + str + str[str.length -1];
}

const assert = require('assert');
assert.equal(backAround('cat'), 'tcatt');
assert.equal(backAround('Hello'), 'oHelloo');
assert.equal(backAround('a'), 'aaa');
assert.equal(backAround('abc'), 'cabcc');
assert.equal(backAround('read'), 'dreadd');
assert.equal(backAround('boo'), 'obooo');
console.log("All tests passed");
