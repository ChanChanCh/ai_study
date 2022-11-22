import random
print("# random 모듈")

# random(): 0.0 <= x < 1.0 사이의 float를 리턴합니다.
print("- random():", random.random())

# uniform(min, max): 지정한 범위 사이의 float를 리턴합니다.
print("- uniform(10, 20):", random.uniform(10, 20))

# randrange(): 지정한 범위의 int를 리턴합니다.
# - randrange(max): 0부터 max 사이의 값을 리턴합니다.
# - randrange(min, max): min부터 max 사이의 값을 리턴합니다.
print("- randrange(10)", random.randrange(10))

# choice(list): 리스트 내부에 있는 요소를 랜덤하게 선택합니다.
print("- choice([1, 2, 3, 4, 5]):", random.choice([1, 2, 3, 4, 5]))

# shuffle(list): 리스트의 요소들을 랜덤하게 섞습니다. (None이 출력이된다)
print("- shuffle([1, 2, 3, 4, 5]):", random.shuffle([1, 2, 3, 4, 5]))

# 이렇게해야 섞어서 출력이된다 (shuffle()은 반환값이없고 원본이 섞이는것이기 때문)
num=[1,2,3,4,5]
random.shuffle(num)
print("- shuffle([1, 2, 3, 4, 5]):", num)


# sample(list, k=<숫자>): 리스트의 요소 중에 k개를 뽑습니다.
print("- sample([1, 2, 3, 4, 5], k=2):", random.sample([1, 2, 3, 4, 5], k=2))