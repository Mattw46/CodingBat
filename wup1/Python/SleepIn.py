'''
    sleep_in
    The parameter weekday is True if it is a weekday, 
    and the parameter vacation is True if we are on vacation. 
    We sleep in if it is not a weekday or we're on vacation. 
    Return True if we sleep in.
'''

def sleep_in(weekday, vacation):
    if not weekday or vacation:
        return True
    else:
        return False
        
def tests():
    assert (sleep_in(False,False) == True)
    assert (sleep_in(True, False) == False)
    assert (sleep_in(False, True) == True)
    assert (sleep_in(True, True) == True)
    print("All tests passed")
    
tests()
