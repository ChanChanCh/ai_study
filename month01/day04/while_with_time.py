# 시간과 관련된 기능을 가져옵니다.
import time

# 변수를 선언.
number = 0

# 5초 동안 반복합니다.
# time.time()은 지금을 뜻한다. 즉! 지금으로부터 5처가 지난뒤를 주문하는것!
target_tick = time.time() + 5  
while time.time() < target_tick:
    number += 1

# 출력합니다.
print("5초 동안 {}번 반복했습니다.".format(number))