
def solution(slice, n):
    a = 1
    count = 0
    while a > n :
        a += slice
        count += 1

    return count


print(solution(7,10))