list_a = [1,2,3,4,5]
print("======")
print(max(list_a))

print(min(list_a))

print(sum(list_a))

print("======")

a = reversed(list_a)
b = list(reversed(list_a))
print(a)
print(b)

# enumerate() 현재 인덱스가 몇번째인지 확인해줌

print("======")
enumerate(list_a)
print(list(enumerate(list_a)))

print("======")

sing = [2022, 20221, 45]


for i, v in enumerate(sing) :
    print("{}번째 내용{}".format(i, v))

# items() = 소괄호

#리스트 내포

list_in = [i for i in range(1, 6) ]

bbb = [i for i in range(6, 1, -1)]

print(list_in)
print(bbb)

# 이터러블 이터레이터

print("==============")
b = reversed([1,2,3,4])
next(b)