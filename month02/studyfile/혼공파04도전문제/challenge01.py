numbers = [1, 2, 3, 4, 5, 5, 4, 3, 2, 6, 6, 6, 6, 6, 6]
count = {}

for number in numbers :
    if number in count :
        count[number] += 1
    else :
        count[number] = 1

print(f"사용된 숫자의 종류는 {len(count)}개입니다.")
print("참고: ", count)