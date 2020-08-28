/*
    missingChar

    Given a non-empty string and an int n, 
    return a new string where the char at index n has been removed. 
    The value of n will be a valid index of a char in the original string 
    (i.e. n will be in the range 0..str.length()-1 inclusive).

*/

function missingChar(str, n){
    if (n === 0) {
        return str.substring(1,str.length);
    }
    else {
        return str.substring(0, n) + str.substring(n + 1, str.length);
    }
}

const assert = require('assert');
assert.equal(missingChar('kitten', 1), 'ktten');
assert.equal(missingChar('kitten', 0), 'itten');
assert.equal(missingChar('kitten', 4), 'kittn');
assert.equal(missingChar('Hi', 0), 'i');	
assert.equal(missingChar('Hi', 1), 'H');	
assert.equal(missingChar('code', 0), 'ode');
assert.equal(missingChar('code', 1), 'cde');	
assert.equal(missingChar('code', 2), 'coe');	
assert.equal(missingChar('code', 3), 'cod');	
assert.equal(missingChar('chocolate', 8), 'chocolat');

console.log("All tests passed");