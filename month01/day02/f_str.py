#format을 대체할수있는 다른방법 f 문자열

f"{1} {2} {3}"

name = "pcy"

# format() 사용
print("제 이름은 {}입니다.".format(name))

# f-문자열 사용
print(f"제 이름은 {name}입니다.")

pi = 3.141592
r = int(input("구의 반지름을 입력해주세요 : "))

# 구의 부피
circle = 4/3 * pi * r**3
cir = 4 * pi * r**2


print(f"구의 부피는 {circle}입니다")
print(f"구의 겉넓이는 {cir}입니다")


#피타고라스의 정리


a = float(input("밑변의 길이를 입력해주세요"))

b = float(input("높이의 길이를 입력해주세요"))

num = (a **2 + b ** 2)**(1/2)
print(f"빗변의 길이는 {num}입니다")











