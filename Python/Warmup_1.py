# Warm Up 1 Problems

# Warmup-1 > sleep_in
#
# The parameter weekday is True if it is a weekday, and the parameter vacation is True if we are on vacation. 
# We sleep in if it is not a weekday or we're on vacation. Return True if we sleep in.

def sleep_in(weekday, vacation):
    if not weekday or vacation:
        return True
    else:
        return False


print('*** Testing sleep_in ***')
assert(sleep_in(False, False) == True)
assert(sleep_in(True, False) == False)
assert(sleep_in(False, True) == True)
assert(sleep_in(True, True) == True)
print('*** End Testing ***')

# Warmup-1 > monkey_trouble
#
# We have two monkeys, a and b, and the parameters a_smile and b_smile 
# indicate if each is smiling. We are in trouble if they are both smiling or 
# if neither of them is smiling. Return True if we are in trouble.

def monkey_trouble(a_smile, b_smile):
  return a_smile == b_smile

print('*** Testing monkey_trouble ***')
assert(monkey_trouble(True, True) == True)
assert(monkey_trouble(False, False) == True)
assert(monkey_trouble(True, False) == False)
assert(monkey_trouble(False, True) == False)
print('*** End Testing ***')