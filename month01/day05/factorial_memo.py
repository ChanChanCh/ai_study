
def factorial(number) :
    result = 1
    for i in range(number, 0, -1) :
        result *= i
    return result

print(factorial(5))