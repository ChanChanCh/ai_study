# 함수 만들기
# 변수는 자료를 저장하고, 함수는 기능을 저장한다
# 매개변수 : 함수가 재료를 받을 수 있게 해주는 변수(식별자)

def hello_3P(name,age) :
    print(f"{name}는 {age}살이다")

# 함수의 호출
hello_3P("캐터피", 3)
hello_3P("국희", 15)
hello_3P("피카츄", 100)

# 매개변수와 관련된 TypeError
# 매개변수와 인수의 갯수가 맞지않으면 TypeError가 난다

    
# 가변매개함수
def singers(number, *singer) :
    pass

singers(2, "김건모", "김범수")
singers(3, "김건모", "김범수", "박정현")

def print_n_time(n, *values):

    for i in range(n):
        for value in values:
            print(value)
        print()

print_n_time(3, "안녕하세요", "즐거운", "파이썬 프로그래밍")

# 기본매개변수(디폴트 파라미터)
# 기본 매개변수 뒤에는 일반 매개변수가 올 수 없다.


def chan(town,name="길동") :
    print(name, town)

chan("홍길동", "만년동") 

# 키워드 매개변수
# 기본 매개변수가 가변 매개변수보다 앞에 올 때 기본 매개변수의 의미가 사라진다

#키워드 매개변수 == 매개변수 지정하여 호출하기

#리턴

def return_test() :
    print("A")
    return # 함수의 기능을 여기서 끝내자
    print("B")

return_test()
def return_test() :
    print("A")
    return 100
    print("B")

def return_test2() :
    print("A")
    return
    print("B")

print(return_test())
print(return_test2())



