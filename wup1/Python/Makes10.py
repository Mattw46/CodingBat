'''
   makes10

   Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.

'''

def makes10(a, b):
   if ((a + b == 10) or (a == 10 or b == 10)):
      return True
   return False

def tests():
   assert (makes10(9, 10) == True)
   assert (makes10(9, 9) == False)
   assert (makes10(1, 9) == True) 
   assert (makes10(10, 1) == True)
   assert (makes10(10, 10) == True)	
   assert (makes10(8, 2) == True)
   assert (makes10(8, 3) == False)	
   assert (makes10(10, 42) == True)
   assert (makes10(12, -2) == True)
   print("All tests passed")
    
tests()