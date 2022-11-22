def add(a, b) :
    return a + b


lambda a, b : a + b


# 둘다 동작은 동일하지만 차이는 있다

# 함수는 반드시 이름이 필요하다
# 람다는 이름 없이 사용 (주로 콜백함수 역할을 할때 사용)

def my_func(func, a, b) :
    return func(a, b)

print(my_func(lambda a, b : a + b, 3, 4))