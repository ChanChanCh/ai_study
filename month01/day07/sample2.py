from urllib import request

from bs4 import BeautifulSoup

# urlopen() 함수로 기상청의 전국 날씨를 읽습니다.
target = request.urlopen("http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108")

# BeautifulSoup을 사용해 웹 페이지를 분석합니다.
soup = BeautifulSoup(target, "html.parser")

# location 태그를 찾습니다.
for location in soup.select("location"):
    print(location)
    if location.select_one("city").string in ["대전", "세종"] :
    # if location.select_one("city") == "대전" or "세종" :
        print("날씨:", location.select_one("wf").string)
        print("최저기온:", location.select_one("tmn").string)
        print("최고기온:", location.select_one("tmx").string)
    else :
        pass
