a = input("문자열> ")
b = input("문자열> ")

t1 = (a,b)
print(t1[0],t1[1])
print(t1[1],t1[0])


print(b,a)

a, b = b, a

print(a,b)
