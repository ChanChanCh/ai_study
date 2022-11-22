# 파이썬은 다음과 같은 방법으로 특정 값이 어떤 자료형인지 확인할 수 있다


character = {
    "name": "기사",
    "level": 12,
    "items": {
        "sword": "불꽃의 검",
        "armor": "풀플레이트"
    },
    "skill": ["베기", "세게 베기", "아주 세게 베기"]

}

for key in character :
    if type(character[key]) is list :
        for i in character[key] :
            print(key, ":", i)
    elif type(character[key]) is dict :
        for i in character[key] :
            print(i, ":", character[key][i])
    else:
        print(key, ":", character[key])