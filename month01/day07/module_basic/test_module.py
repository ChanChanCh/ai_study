# test_module.py 파일
PI = 3.141592

def number_input():
    output = input("숫자 입력> ")
    return float(output)

def get_circumference(radius):
    return 2 * PI * radius

def get_circle_area(radius):
    return PI * radius * radius

#이 파일이 진입점일 때만 실행된다는 뜻
if __name__ == "__main__" :
    print("출력해보즈아~")
    print(__name__)