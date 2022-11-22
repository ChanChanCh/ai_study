
numbers = [1, 2, [3, 4], 5, [6, 7], [8, 9]]
flattern = []

for number in numbers :
    if type(number) == list :
        flattern.extend(number)
    else :
        flattern.append(number)

print("{}를 평탄화하면 {}입니다.".format(numbers, flattern))