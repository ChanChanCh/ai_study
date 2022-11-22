# map
teas = ["녹차", "우엉차", "보리차"]

def handleTea(tea) : 
    return "맛있는 " + tea


newTeas = map(handleTea, teas)

print(newTeas)
print(list(newTeas))

# filter()

foods = ["닭강정", "닭계장", "짜장면"]

def handleFood(food) :
    return "닭" in food


newFoods = filter(handleFood, foods)

print(newFoods)
print(list(newFoods))