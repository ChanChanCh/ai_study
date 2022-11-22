numbers = [273, 103, 5, 32, 65, 9, 72, 800, 99]


for number in numbers :
    if number % 2 == 0:
        print(f"{number}는 짝수 입니다.")
    else :
        print(f"{number}는 홀수 입니다.")

# 숫자를 문자열로 바꾼후 길이재서 자릿수 구하기
for number in numbers :
    count = len(str(number))
    print(f"{number}는{count} 자릿수 입니다.")