# 교육목적으로만든 그래픽모듈
import turtle

from turtle import Turtle

# 커서 꾸미기 메소드들
cursor = turtle.Turtle()
cursor.color("blue")
cursor.shape("turtle")

canvas = cursor.getscreen()

# 그리기 메소드
cursor.forward(200)
cursor.backward(200)
cursor.left(90)
cursor.penup()
cursor.pendown()
cursor.penup()

isPenUp = True

def gf() :
    cursor.forward(50)
def gb() :
    cursor.backward(50)
def tr() :
    cursor.right(90)
def tl() :
    cursor.left(90)
def togglleDraw() :

    if cursor.isdown() :
        cursor.penup()

    else :
        cursor.pendown()




    

canvas.onkeypress(gf, "Up")
canvas.onkeypress(gb, "Down")
canvas.onkeypress(tr, "Right")
canvas.onkeypress(tl, "Left")
canvas.onkeypress(togglleDraw, "space")




#커서가 계속 깜빡이는 상태
canvas.listen()
#계속 반복하여 돌아가는상태
canvas.mainloop()





