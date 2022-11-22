from curses import ACS_GEQUAL


class Bird :
    pass

# __init__ 사용 (생성자 호출시 사용)

class Bird :
    def __init__(self) :
        pass

b1 = Bird()
b2 = Bird()

class  poket:
    def __init__(self, name) :
        print("새로운 포켓몬을 포획했다.")
        print(f"이름은 {name}이다")
# __del__ (소멸자)
    def __del__(self):
        print("포켓몬을 풀어주었다")

b1 = poket("피카츄")
b2 = poket("라이츄")
        
# __del__ (소멸자)
def __del__(self):
    print("포켓몬을 풀어주었다")


class Person :
    def __init__(self, age) :
        self.age = age 
    def __eq__(self, person) :
        return self.age == person.age

p1 = Person(2)
p2 = Person(2)
p1 == p2

