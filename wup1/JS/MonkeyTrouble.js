/* MonkeyTrouble
    We have two monkeys, a and b, and the parameters 
    aSmile and bSmile indicate if each is smiling. 
    We are in trouble if they are both smiling or 
    if neither of them is smiling. Return true if we are in trouble.*/
    
function monkeyTrouble(aSmile, bSmile){
  if ((aSmile && bSmile) || (!aSmile && !bSmile)) 
    return true;
  else
    return false;
}

const assert = require('assert');
assert.equal(monkeyTrouble(true, true), true);
assert.equal(monkeyTrouble(false, false), true);
assert.equal(monkeyTrouble(true, false), false);
assert.equal(monkeyTrouble(false, true), false);
console.log("All tests passed");