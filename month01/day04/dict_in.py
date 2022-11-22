player = {
    7: "손흥민",
    11: "황희찬"
        
}
player[26] = "권창훈"
player[7] = "박지성"

# in 키워드 사용
7 in player

7 not in player

# 오류
"박지성" in player

# get() 함수
player.get(7)  # 박지성을 가져옴

# in 키워드와 get()함수가 다른점
# 좋은건 get()이 좋으나 시간복잡도가 in이 더 빠르게처리해서 좋은것 같다.

for p in player :
    print(p)


