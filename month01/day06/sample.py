
with open("talk.txt","w") as f :

    f.write("노력은 배신하지 않는다.!")

   
   
with open("talk.txt","r") as file:

    contents = file.read()
    
print(contents)


