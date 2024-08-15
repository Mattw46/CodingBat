# Warm Up 2 Problems

# Warmup-2 > string_times
#
# Given a string and a non-negative int n, return a larger string that 
# is n copies of the original string.
def string_times(str, n):
    string = ''
    count = 0
    while(count < n):
        string += str
        count += 1
    return string 

print('*** Testing string_times ***')
assert(string_times('Hi', 2) == 'HiHi')
assert(string_times('Hi', 3) == 'HiHiHi')
assert(string_times('Hi', 1) == 'Hi')
assert(string_times('Hi', 0) == '')
assert(string_times('Hi', 5) == 'HiHiHiHiHi')
assert(string_times('Oh Boy!', 2) == 'Oh Boy!Oh Boy!')
assert(string_times('x', 4) == 'xxxx')
assert(string_times('', 4) == '')
assert(string_times('code', 2) == 'codecode')
assert(string_times('code', 3) == 'codecodecode')
print('*** End Testing ***')

#Warmup-2 > front_times
#
# Given a string and a non-negative int n, we'll say that the front of 
# the string is the first 3 chars, or whatever is there if the string is 
# less than length 3. Return n copies of the front;
def front_times(str, n):
    if len(str) >= 3:
        front = str[0:3]
    else:
        front = str
    string = ''
    count = 0
    while(count < n):
        string += front
        count += 1
    return string

print('*** Testing front_times ***')
assert(front_times('Chocolate', 2) == 'ChoCho')
assert(front_times('Chocolate', 3) == 'ChoChoCho')
assert(front_times('Abc', 3) == 'AbcAbcAbc')
assert(front_times('Ab', 4) == 'AbAbAbAb')
assert(front_times('A', 4) == 'AAAA')
assert(front_times('', 4) == '')
assert(front_times('Abc', 0) == '')
print('*** End Testing ***')
