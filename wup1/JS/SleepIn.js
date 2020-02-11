function sleepIn(weekday, vacation){
    if (!weekday || vacation) 
      return true;
    else
      return false;
  }
  
  const assert = require('assert');
  assert.equal(sleepIn(true,true),true);
  assert.equal(sleepIn(true, false), false);
  assert.equal(sleepIn(false, true),true);
  assert.equal(sleepIn(true, true), true);
  console.log("All tests passed");