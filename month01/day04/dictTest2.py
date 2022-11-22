numbers = [1,4,3,2,4,3,5,6,5,4,3,5,1,2,3]
counter = {}

for number in numbers :
    if number not in counter :
        counter[number] = 1
    else :
        counter[number] += 1

print(counter)