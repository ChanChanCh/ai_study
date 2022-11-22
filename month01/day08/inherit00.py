class CustomException(Exception):
    def __init__(self):
        super().__init__()
        print("@@@@@@@@@@@@@@@@오류생성!!!!@@@@@@@@@@@@@@@@")

    def __str__(self):
        return "오류~~~!"

    

raise CustomException

