array = [0,1,2,3,4]
j = []

v = array

for i in array:
    j = i
    print("i = ",i)
    print("j = ",j)

power = lambda x : x * x 
plus = lambda x : x + x
second = lambda x : x < 3 

powern = map(power, list(array))
print(list(powern))

plusN = filter(second, list(array))
print(list(plusN))

print(sum(array))
print(sum(array))
print(array)

rv = list(reversed(array))

print(rv)

print(list(enumerate(array)))