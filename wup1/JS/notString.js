/*
    notString

    Given a string, return a new string where "not " has been added to the front. 
    However, if the string already begins with "not", return the string unchanged.
*/

function notString(str){
    if (str.length >= 3 && str.substring(0,3) == "not") {
        return str;
    }
    return 'not ' + str;
}

const assert = require('assert');
assert.equal(notString('candy') , 'not candy');
assert.equal(notString('x'), 'not x');
assert.equal(notString('not bad'), 'not bad');
assert.equal(notString('bad'), 'not bad');	
assert.equal(notString('not'), 'not');	
assert.equal(notString('is not'), 'not is not');	
assert.equal(notString('no'), 'not no');

console.log("All tests passed");