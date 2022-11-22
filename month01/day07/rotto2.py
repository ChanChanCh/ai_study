import random

n = int(input("갯수를 적어주세요"))

for i in range(n) :
    lotto = random.sample(list(range(1,46)), k= 6)
    lotto.sort()
    print(lotto)