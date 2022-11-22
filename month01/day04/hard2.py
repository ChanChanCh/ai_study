dna = "ctacaatgtcagtatacccattgcattagccgg"

array = {}


for i in dna :
    if i not in array :
        array[i] = 1
    elif i in array :
       array[i] += 1


print("a의 개수",array["a"])
print("t의 개수",array["t"])
print("g의 개수",array["g"])
print("c의 개수",array["c"])

