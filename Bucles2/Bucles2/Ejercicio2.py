'''
Created on 3 Nov 2020

@author: xXxArroyoxXx
'''
'''
Design a program for reading an integer between 0 and 10 and show the times table.
To ask for the number you should show the next message 
"Enter one numberbetween 0 and 10”. 
If the number is out of the boundaries, the program should showthe message 
“The number is out of the boundaries”. 
If the number is valid, it shouldshow the times table following the next format:
7*0=0
7*1=7.....
7*10=70
'''
import time
while True:
    num = int(input("What number want multiplier"))
    if num>10 or num<0:
        print("The number is out of the boundaries")
    else:
        for i in range(0,10+1,1):
            print(str(num)+"x"+str(i)+"="+str(num*i))
    time.sleep(1)
