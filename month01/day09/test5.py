import random

def getData() :
    return random.randrange(1,11)

rn = getData()

print(rn)

# 기본매개변수 설정 => ()함수 호출시 인수전달을 하지않아도 실행이된다 ,인수전달도 가능
def getData2(maxNum = 100) :
    return print(random.randrange(1, maxNum + 1))

getData2()
getData2(1000)

# 인수를 여러개받아서 처리하고싶을때 * 사용 (가변 매개변수)
def getTotal(*args) :
    return print(sum(args))

getTotal(1,2,3)


