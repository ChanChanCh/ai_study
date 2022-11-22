numbers = list(range(1, 10 + 1))

#홀수만 추출하기
list(filter(lambda x : x % 2, numbers))

# 3이상 7 미만 추출하기
list(filter(lambda x : x >= 3 and x < 7, numbers, numbers))

# 제곱해서 50 미만 추출하기
list(filter(lambda x : x ** 2 < 50, numbers))