'''
    monkey_trouble
    We have two monkeys, a and b, and the parameters a_smile and b_smile 
    indicate if each is smiling. We are in trouble if they are both smiling 
    or if neither of them is smiling. Return True if we are in trouble.
'''

def monkey_trouble(a_smile, b_smile):
    if (a_smile and b_smile) or (not a_smile and not b_smile):
        return True
    else:
        return False
        
def tests():
    assert (monkey_trouble(True, True) == True)
    assert (monkey_trouble(False, False) == True)
    assert (monkey_trouble(True, False) == False)
    assert (monkey_trouble(False, True) == False)
    print("All tests passed")
    
tests()