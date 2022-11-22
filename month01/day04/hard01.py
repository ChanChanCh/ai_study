a = [1, 2, 3, 4, 1, 2, 3, 1, 4, 1, 2, 3]


counter = {}

for num in a :
    if num not in counter :
        counter[num] = 1
    else :
        counter[num] += 1


print(counter)


