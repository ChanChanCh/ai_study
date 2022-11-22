class Student:
    def __init__(self, name, score):
        self.name = name
        self.score = score

class Student:
    def __init__(self, name, score):
        self.name = name
        self.score = score

class StudentList:
    def __init__(self):

        self.students = []
    def append(self, student):
        return self.students.append(student)
    def get_average(self):
       
        return sum([i.score for i in self.students])/len(self.students)
# key = 
    def get_first_by_score(self):
        return max(self.students, key=lambda x : x.score)
    def get_last_by_score(self):
        return min(self.students, key=lambda x : x.score)

students = StudentList()
students.append(Student("구름", 100))
students.append(Student("별", 49))
students.append(Student("초코", 81))
students.append(Student("아지", 90))

print(f"학급의 평균 점수는 {students.get_average()}입니다.")
print(f"가장 성적이 높은 학생은 {students.get_first_by_score().name}입니다.")
print(f"가장 성적이 낮은 학생은 {students.get_last_by_score().name}입니다.")

