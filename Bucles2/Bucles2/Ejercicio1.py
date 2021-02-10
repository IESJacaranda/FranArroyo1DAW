'''
Created on 3 Nov 2020

@author: xXxArroyoxXx
'''
'''
Design a program to show all numbers between 1 and 100. 
If the number is amultiple of 7 you should show the message 
"The number xx is a multiple of 7".
If thenumber is a multiple of 13 you should show the message 
"The number xx is amultiple of 13". 
If the number is a multiple of 7 and 13 you should show bothmessages.
'''
for i in range(1,101,1):
    if i%7==0 and i%13==0:
        print("The number ",i," is multiple of 7 and 13")
    elif i%7==0:
        print("The number ",i," is multiple of 7")
    elif i%13==0:
        print("The number ",i," is multiple of 13")
    else:
        print(i)
