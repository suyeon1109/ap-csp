from random import randrange

def createNumList():
# create a list of numbers that will be used in a number guessing game
    numList=[]
    for i in range(0,3):
        numList.append(randrange(18))
    return numList

numList = createNumList()
count=1

def checkAns(answer):
# check if the user's answer is right or wrong
# if the answer is wrong, it tells if the answer should be bigger or smaller until the user gets the correct answer
    while answer!=numList[count-1]:
        if answer>numList[count-1]:
            print("Down")
            answer = int(input("Guess the number again: "))
        else:
            print("Up")
            answer = int(input("Guess the number again: "))
    print("Correct!")

# main process
while count<4:
    print("*Problem%d" % count)
    answer = int(input("Guess the number (between 0 and 17): "))
    if answer == numList[count-1]:
        print("Correct!")
        count+=1
    else:
        checkAns(answer)
        count+=1