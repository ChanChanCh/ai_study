import random

n = int(input("갯수를 적어주세요"))


lotto = []
rnd_num = random.randrange(1, 45)

for i in range(n):
    lotto = []
    for i in range(6):
        while rnd_num in lotto:
            rnd_num = random.randrange(1, 45)
        lotto.append(rnd_num)

    print("로또번호: {}".format(lotto))
lotto.sort()


