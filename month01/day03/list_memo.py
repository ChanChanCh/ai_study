# [] 안에 들어간 숫자를 인덱스라부름
array = [10,20,30,40,50,]

print(array[2])
#슬라이싱(1:3)같은 작업처리 가능

# 인덱싱 : 해당 인덱스의 자료를 보여줘!
# 슬라이싱: 해당 인덱스 범위 만큼의 자료들을 보여줘!
# 슬라이싱 특성 ? => 콩 심은 데 콩난다! 
# 자료형이 바뀌지 않음 문자열 슬라이싱 = 문자열 / 리스트 슬라이싱 = 리스트 반환. 


# 리스트 접근 연산자를 다음과 같이 이중으로 사용할 수 있다.
players = ["손흥민", "황희찬", "이강인"]
print(players[-1])
print(players[-1][-1])

# 리스트 안에 리스트를 사용할 수도 있다. 
# 2차원 배열[][]

fruits = [["포도","복숭아"],["감","귤"]]
print(fruits[0])
print(fruits[0][0])
print(fruits[0][0][0])

# 리스트 연산하기: 연결 + , 반복 *, len() 

# 리스트에 요소 추가하기: append(), insert()

animal = ['고양이', '강아지', '햄스터']
# append()는 맨 뒤에 요소가 추가됨
animal.append("거북이")

# insert()는 요소를 원하는 위치에 넣어 줄 수 있음
animal.insert(2,"앵무새")

# extend() = 리스트 + 리스트를 하여 확장한다

animal.extend(["열대어", "미어캣"])

# + 와 extend() 차이점

# + 를 써서 리스트를 연결하면, 리스트의 원본은 그대로 유지되고, 새로운 리스트가 생성된다.
# 반면 extend 함수를 사용해 리스트를 확장하면, 원본리스트 자체가 확장되어 변경된다

a = [1,2,3]
b = [4,5,6]

a+b 

# del 키워드는 리스트의 요소 뿐 아니라, 리스트 자체를 삭제할 때도 사용할 수 있다. 더불어
# 다른 자료형의 데이터들도 통재로 삭제할 수 있다.
del animal[-1]

animal.pop(2)

# 값으로 제거하기 : remove()
animal.remove("거북이")

# 모두 제거하기 : clear()

numbers = [1,2,3,4,5]
# 리스트 정렬하기: sort() / 기본이 오름차술
numbers.sort()
# 리스트 내림차순 정렬
numbers.sort(reverse=True)

# 리스트 내부에 있는지 확인하기: in/not in 연산자

"열입" in "문자열입니다"

"문" in ["문","자","열"]

# 없는지 확인
"문" not in ["문","자","열"]




