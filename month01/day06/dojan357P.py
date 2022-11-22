from turtle import circle


circle = int(input("원판의 이개수를 입력해주세요:"))

print(circle)

def r(n) :
    r_run = 2 ** n -1
    return r_run


print("이동 횟수는 {}회 입니다.".format(r(circle)))