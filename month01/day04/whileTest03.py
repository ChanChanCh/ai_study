limit = 10000
i = 1

sum_value = 0

while True :
    sum_value += i
    if sum_value > limit :
        break
    i += 1



print("{}를 더할 때 {}을 넘으며 그대의 값은 {}입니다.".format(i-1, limit, sum_value))
