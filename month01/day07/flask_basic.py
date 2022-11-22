from flask import Flask
app = Flask(__name__)

#서버객체
@app.route("/")
def hello():
    return "<h1>Hello World!</h1>"

    #데코레이터 => @app.route
    # $env:FLASK_APP= "파일이름"
    # flask run

