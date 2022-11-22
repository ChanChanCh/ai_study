#

#모듈 : 자료 및 기능이 정의된 소스 파일
# -----> print(), type(), len() 와 같이 설정을 따로해주지않아도 기능을 사용할수 있음

# 모듈을 사용할땐 import해준다

#날짜 / 사간과 관련된 기능을 가져온다
import datetime

# 현재 날짜/시간을 구함
now = datetime.datetime.now()


#출력
print(now.year, "년")
print(now.month, "월")
print(now.day, "일")
print(now.hour, "시")
print(now.minute, "분")
print(now.second, "초")


#날짜와 시간 한 줄로 출력하기
print("{}년 {}월 {}일 {}시 {}분 {}초".format(
    now.year,
    now.month,
    now.day,
    now.hour,
    now.minute,
    now.second
))