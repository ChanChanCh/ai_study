
dna_str = input("염기서열 입력해주세")

dict_dna = {}

codon = ""

for i in range(0, len(dna_str - 2, 3)) :
    codon = dna_str[i] + dna_str[i + 1] + dna_str[i + 2]

    if codon not in dict_dna :
