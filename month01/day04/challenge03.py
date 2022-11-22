
dna_str = input("염기 서열을 입력해주세요: ")
dict_dna = {}

codon = ""

print(len(dna_str))

for i in range(0, len(dna_str) - 2, 3) :
    codon = dna_str[i] + dna_str[i + 1] + dna_str[i + 2]
    if codon not in dict_dna :
        dict_dna[codon] = 1
    else :
        dict_dna[codon] += 1

print(dict_dna)