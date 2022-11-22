# 딕셔너리를 선언합니다.

dictionary = {
    # 딕셔너리 문자열 키와 관련된 실수
    # 키값을 문자열이아닌 변수개념처럼 입력하면 오류가 발생한다 문자열로 만들어놓아야한다.
    "name": "7D 건조 망고",
    "type": "당절임",
    "ingredient": ["망고", "설탕", "메타중아황산나트륨", "치자황색소"],
    "origin": "필리핀"

}

# 출력합니다.
print("name", dictionary["name"])
print("type", dictionary["type"])
print("ingredient", dictionary["ingredient"])
print("origin", dictionary["origin"])
print()

# 값을 변경합니다

dictionary["name"] = "8D 건조 망고"
print("name:", dictionary["name"])
