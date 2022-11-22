#스택 구현하기
class Stack:
    def __init__(self):
        self.list = []
    def push(self, item):
        self.list.append(item)
    def pop(self):
        return self.list.pop()

stack = Stack()
stack.push(10)
stack.push(20)
stack.push(30)


print(stack.pop())
print(stack.pop())
print(stack.pop())

#큐 구현하기
count = 0
class Queue:
    def __init__(self):
        self.list = []
    def enqueue(self, item): 
        self.list.append(item)
        return print(self.list)
    def dequeue(self):
       
        return self.list.pop(0)

queue = Queue()
queue.enqueue(10)
queue.enqueue(20)
queue.enqueue(30)

print(queue.dequeue())
print(queue.dequeue())
print(queue.dequeue())


