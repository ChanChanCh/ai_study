
#클래스 Player 집접 정의하기

class Player : 
    def __init__(self, name, sports, Special):
        self.name = name
        self.sports = sports
        self.Special = Special

    def introduce(self):
        i= "{}은 {}선수이며,특기는 {} 입니다".format(self.name , self.sports, self.Special)
        print(i)

    def changeSpecial(self, Special):
        self.Special = Special



football_player = Player("손흥민", "축구", "킥")
baseball_player = Player("김현수", "야구", "타격")


football_player.introduce() # 손흥민은 축구선수이며, 특기는 킥입니다
baseball_player.introduce()
football_player.changeSpecial("슛")
football_player.introduce()




