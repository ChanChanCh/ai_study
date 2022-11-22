

#1번째 방법
for i  in range(0,100) :
    if i % 10 ==0 :
        print(i)


#2번째 방법 범위가 늘어나도 사용가능
for i  in range(0,100) :
    if str(i).count('0') == 1 :
        print(i)