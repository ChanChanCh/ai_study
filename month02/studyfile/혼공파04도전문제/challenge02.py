
dna = input("염기 서열을 입력해주세요: ")
atgc = ["a", "t", "g", "c"]

for i in atgc :
    print(f"{i}의 개수 : {dna.count(i)}")