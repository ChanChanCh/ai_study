class Person :
    def __init__(self, age) :
        self.age = age 
    def __eq__(self, person) :
        return self.age == person.age

p1 = Person(2)
p2 = Person(2)
print(p1 == p2)


