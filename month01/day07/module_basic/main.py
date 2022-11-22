# main.py 파일
# import가 가져올 수 있는 대상
# 1. 시스템에 설치되어 있는 모듈
# 2. 같은 폴더 내에 있는 모듈



import test_module as test
# from test_module import * <== test.을 안쓰고싶을때 사용

radius = test.number_input()
print(test.get_circumference(radius))
print(test.get_circle_area(radius))


