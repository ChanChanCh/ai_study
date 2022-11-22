# 

def cal_numbers(*numbers, isSum=True) :
    if isSum :
        print(sum(numbers))
    else :
        print(numbers)



cal_numbers(1, 2, 3, 4, 5, 6)
cal_numbers(1, 2, 3, 4, 5, 6 ,7 ,8)
cal_numbers(1, 2, 3, 4, 5, 6, isSum=False)

def sum_all(start, end) :
    output = 0
    for i in range(start, end + 1) :
        output += i
    return output

print(sum_all(1,10))