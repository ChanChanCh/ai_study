#format() 함수로 숫자를 문자열로 변환하기

format_a = "{}만 원".format(5000)
format_b = "파이썬 열공하여 첫 연봉 {}만 원 만들기".format(5000)
format_c = "{} {} {}".format(3000,4000,5000)
format_d = "{} {} {}".format(1, "문자열", True)

#출력하기
print(format_a)
print(format_b)
print(format_c)
print(format_d)


# 정수를 특정 칸에 출력하기 {:d}
print("===정수를 특정 칸에 출력하기===")
print("{}".format(100))

print("{:d}".format(100))

#17인덱스가 추가됨 (빈칸의 크기가 늘어남)
print("{:20d}".format(100))

# 원래크기보다 작으면 무시함
print("{:3d}".format(10000))

# 채워넣기
print("{:010d}".format(100))
print("{:+10d}".format(100))
print("{:-10d}".format(100))
print("{: 0d}".format(100))



#정수
output_a = "{:d}".format(52)

# 특정 칸에 출력하기
output_b = "{:5d}".format(52)    # 5칸
output_c = "{:10d}".format(52)   # 10칸

# 빈칸을 0으로 채우기
output_d = "{:05d}".format(52)      # 양수
output_e = "{:05d}".format(-52)     # 음수

# 조합하기

output_h = "{:+5d}".format(52)      # 기호를 뒤로 밀기 : 양수
output_i = "{:+5d}".format(-52)      # 기호를 뒤로 밀기 : 음수
output_j = "{:=+5d}".format(52)    # 기호를 앞으로 밀기 : 양수
output_k = "{:=+05d}".format(-52)      # 기호를 앞으로 밀기 : 음수
output_l = "{:+05d}".format(52)   # 0으로 채우기 : 양수
output_m = "{:+05d}".format(-52)   # 0으로 채우기 : 음수

print("# 조합하기")
print(output_h) 
print(output_i)     
print(output_j)   
print(output_k)     
print(output_l) 
print(output_m)


# 부동 소수점 출력하기{:f}

# 소수점 아래 자릿수 지정하기 {:0.4f}

output00 = "{:0.4f}".format(3.1415)
output01 = "{:0.2f}".format(3.1415)

print(output00)
print(output01)

# 대소문자 바꾸기 upper() 와 lower()

print("Hello Python".lower())

print("Hello Python".upper())

# immutable : 원본이 변경되지 않는 특성
# upper() 와 lower() 는 원본파일이 변경되지않는 특성을가지고있따
# 이말이 무슨말이냐 원본파일 Hello Python은 변경되지 않고
# Hello Python을 복사해와서 복사해온파일을 바꾸고 반환한다는것
# 즉 원본파일은 손상이 없다는 말이다
# 원본파일이 바뀌냐 안바뀌냐에따라 파괴적 함수와 비파괴적 함수로 나뉜다


# 공백 없애기 strip()

print("  졸리당  ".strip())

print("  졸리당  ".lstrip())

print("  졸리당  ".rstrip())



# 문자열의 구성 파악하기 : isOO()

# 문자열 함수 중 is00 유형의 함수들은 결과가 반드시 둘 중 하나다!
# => True / False (bool)


# 문자열 찾기: find()와 rfind()


print("안녕안녕하세요".find("안녕"))

print("안녕안녕하세요".rfind("안녕"))

# 찾는 값이 없으면 -1을 반환함
print("안녕안녕하세요".find("우먼"))



# 문자열과 in 연산자 (불리언으로 반환)

print("스트리트"in"스트리트 맨 파이터")

print("우먼"in"스트리트 맨 파이터")

# split() 기준을 토대로 나눔


# .split(" ") 공백을 기준으로 나눠보기
print("너와 나의 연결 고리".split(" "))

# .split("고")를 기준으로 나눠보기 
print("너와 나의 연결 고리".split("고"))




















