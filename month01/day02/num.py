#number

# 정수 구분하기 : 0, 양의 정수, 음의 정수
# 실수 구분하기 : 양의 실수, 음의 실수

# int : 정수
# float : 부동소수점(실수)

# EX) => 0은 정수 0.0은 실수

# type() => 괄호 안에 입력한 자료가 어떤형태인지 알려줌

print(type(21.1))
print(type(0.0))
print(type(0))

# 지수표현 (파이썬에서의 지수 표현 )

# 지수 => 3 * 10의 6승
#   10 = e
#   EX) 0.522 * 10의 3승 이라면
#   --> 0.522E3 == 0.522 * 10의3승

#숫자 연산자 : +,-,*,/

#다른연산들은 쉽기때문에 주의 깊게 살펴볼것 없지만 나누기만 조금 살펴보겠다

# 나눗기 연산은 실수가 기본으로 나온다
# 딱 나누어 떨어지면 상관없지만

# // <--- 정수 나누기 연산자: //

# 주석으로 많이 사용해왔는데... 파이썬에선 정수 나누기 연산자..? 라고한다
# 나누기 연산자는 실수가 기본으로나오지만 정수 나누기 연산자는 정수가반환된다

print(3/2)
print(3//2)

print(15/2)
print(15//2)

# 나머지 연산자 %
print(15%2)
# 나머지연산자는 자바와 다른 점이 없었다

# 제곱 연산자 : **

print("2 ** 1 =", 2 ** 1)
print("2 ** 2 =", 2 ** 2)
print("2 ** 3 =", 2 ** 3)
print("2 ** 4 =", 2 ** 4)

# 연산자의 우선순위
# 연산자의 우선순위도 크게 다른점이없다 + - 보다 * 나 / 가 우선이된다는것!
# + 나 - 여도 괄호안에 들어있는 연산이 우선이라 괄호안 연산이 먼저라는것!

#EX (2 + 2 - 2 * 2 / 2 * 2)
#  => 이럴경우 연산이 많은 2 * 2 우선처리후 /처리 결과값 = 0.0

# 파이썬에서는  연산할때 괄호를 () 소괄호만 사용한다 []대괄호를 사용하지 않음

#TypeError 예외

string = "문자열"
number = 273
# print(string + number)


#문자열 연산자의 우선순위 EX)

print("안녕"+"하세요"*3)

print(("안녕"+"하세요")*3)

print("안녕"+("하세요"*3))

print("안녕"+"하세요"*3)

print("안녕"+("하세요"*3))






















