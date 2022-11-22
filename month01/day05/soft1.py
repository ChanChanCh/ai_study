def mul(*values):
    v=1
    for i in values :
        v *= i 
    return v


print(mul(5, 7, 9, 10))