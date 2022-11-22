a = [1,2,3,4,5,6,7,8,9]
f = [20,30,40]
b = a[0:5]

print(b)

c = b[0:2]

print(c)

a.extend(f)

print(a)

del a[0:8]
del b[0:2]

print(a)
print(b)
print(c)
print(a)