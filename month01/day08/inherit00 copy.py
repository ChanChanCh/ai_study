class CustomException(Exception):
    def __init__(self, message, value, pd):
        super().__init__()
        self.message = message
        self.value = value
        self.pd = pd
        

    def __str__(self):
        return self.message


    def print(self):
        print("=====오류정보=====")
        print("메세지 : ", self.message)
        print("내용 : ", self.value)
        print("피드백 : ", self.pd)


try:
    raise CustomException("이유없음", 273,"????? 해결해봐~")
except CustomException as e :
    e.print()




