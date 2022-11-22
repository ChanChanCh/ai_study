# 사용자 입력: input()

# input()함수로 사용자 입력받기

a = input("인사말을 입력하세요>")

print("입력값 받은 a의 값은? = ",a)


# input() 함수의 입력 자료형

str = input("입력값 받은 str값은 ?>")

print("========출력값========")
print(type(str))
print(type(a))

# input() 함수의 반환값은 언제나 문자열이다!

# 문자열을 숫자로 바꾸기
# 문자열 + 정수를 하면 TypeError가 나오게되는데 이를해결하려면
# 형변환이 필요하다 파이썬에서는 형변환이 어떻게 진행되는가?

# 숫자에서 사용하는 자료형은 int() 와 float()이 있다.

# int(???) : 문자열을 정수로 변환(cast)
# float(???) : 문자열을 실수로 변환(cast)

# 주의할점!
# => 숫자를 표현한 문자열만 사용 가능하다!

#EX)

num = int("1234")
string = int("천이백삼십사")
# str은 ValueError 가 나오게된다!!!

#숫자를 문자열로 바꾸기

# str(다른자료형) => 문자열이 아닌 걸 문자열로 변환

# 프로그램의 일반적인 동작 흐름 :
# 입력 -> 가공(처리) -> 출력


#inch 단위를 cm 단위로 변경하기 EX) (inch_to_cm.py예제)


















