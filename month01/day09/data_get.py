# BeautifulSoup의 역할 웹에서 데이터를 가져와 분석을 함

import requests
from bs4 import BeautifulSoup

response = requests.get("https://finance.naver.com/")
code = response.text

soup = BeautifulSoup(code, "html.parser")

kospi = soup.select_one("span.dn > span.num")

print(code)
print(kospi.string)

