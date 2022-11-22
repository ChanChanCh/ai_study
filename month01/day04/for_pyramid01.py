output = ""

for i in range(1, 10):
    for j in range(0, i):
        output += "*"
    output += "\n"

print(output)

# 이런식으로 출력됨 *"\n"**"\n"***"\n"****"\n"*****"\n"