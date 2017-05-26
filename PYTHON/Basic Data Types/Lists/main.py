#Create a list
list = []


def insertValue(index, value):
    list.insert(index, value)


def printValues():
    print(list)


def removeItem(item):
    list.remove(item)


def appendItem(item):
    list.append(item)


def sortList():
    list.sort()


def popItem():
    list.pop(-1)


def  reverseList():
    list.reverse()


noOfOpertions = int(input())
for i in range(0, noOfOpertions):
    operation = str(input())
    oper = operation.split(" ", 3)
    if oper[0] == "insert":
        item1 = int(oper[1])
        item2 = int(oper[2])
        insertValue(item1,item2)
    elif operation == "print":
        printValues()
    elif oper[0] == "remove":
        item1 = int(oper[1])
        removeItem(item1)
    elif oper[0] == "append":
        item1 = int(oper[1])
        appendItem(item1)
    elif operation == "sort":
        sortList()
    elif operation == "pop":
        popItem()
    elif operation == "reverse":
        reverseList()
