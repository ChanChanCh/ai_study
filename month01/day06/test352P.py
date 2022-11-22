numbers = [1,2,3,4,5,6]

#  숫자사이에 "::" 추가하기
 
str(numbers)

str(numbers)[1:-1]

str(numbers)[1:-1].replace(",","")

"::".join(str(numbers)[1:-1].replace(",",""))


#좀더 쉬운방법

map( lambda x : str(x), numbers)

list(map( lambda x : str(x), numbers))

"::".join(list(map( lambda x : str(x), numbers)))