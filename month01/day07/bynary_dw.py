#모듈을 읽어 들입니다.
from urllib import request

# urlopen() 함수로 구글의 메인페이지를 읽습니다
target = request.urlopen("https://shared-comic.pstatic.net/thumb/nas/user_contents_data/challenge_comic/2022/06/04/354200/thumbnail_83x9083f18a9a_cca3_4407_a6d6_9337d3b015b4_00001170.JPEG")
output = target.read()
print(output)

# write binary [바이너리 쓰기] 모드로

file = open("output.png","wb")
file.write(output)
file.close()