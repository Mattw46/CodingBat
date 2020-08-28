/*
    frontBack

    Given a string, return a new string where the first and 
    last chars have been exchanged.
*/

function frontBack(str){
    if (str.length === 1) {
        return str;
    }
    else {
        return str.substring(str.length - 1, str.length) + 
        str.substring(1,str.length - 1) + str.substring(0,1);
    }
}

const assert = require('assert');
assert.equal(frontBack('code'), 'eodc');
assert.equal(frontBack('a'), 'a');
assert.equal(frontBack('ab'), 'ba');
assert.equal(frontBack('abc'), 'cba');	
assert.equal(frontBack(''), '');	
assert.equal(frontBack('Chocolate'), 'ehocolatC');	
assert.equal(frontBack('aavj'), 'java');	
assert.equal(frontBack('hello'), 'oellh');

console.log("All tests passed");