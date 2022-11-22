
for i in range(5):
    star = ""     # 누적초기화
    for j in range(i+1):
        star += "*"
    print(star)

for i in reversed(range(4)):
    star = ""     # 누적초기화
    for j in range(i+1):
        star += "*"
    print(star)