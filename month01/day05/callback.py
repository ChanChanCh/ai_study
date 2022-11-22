# 콜백함수 : 함수에 전달하는 함수

def sayHello() :
    print("Hello")

def callSayHello(func):
    func()
# 콜백함수로 사용할댄 이름만 함수를 호출할땐 괄호포함
callSayHello(sayHello)
sayHello()
