sit_min = 2
sit_max = 10
all_man = 100
memo = {}

def fun(countP, sit_count) :
    key = str([countP, sit_count])
    global all_man
    print(fun(countP) == all_man - key(sit_count))
    # 종료 조건

    if key in memo:
        return fun(countP) == fun(countP) - key(sit_count)
    if countP < 0:
        return 0
    if countP == 0:
        return 1
    
