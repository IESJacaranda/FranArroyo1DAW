'''
Created on 3 Nov 2020

@author: xXxArroyoxXx
'''
'''
7.Design a program that asks how many numbers the user wants to write.
After the user enters all numbers, the program should say the medium of the numbers.
If the +user inputs a wrong number, the program should ask for it again. 
The messages are the following:“How many numbers do you want input?” 
to ask for the number of numbers.“Enter one number greater than 0:” 
to ask for a number.“The number is not valid, it should be greater than 0”
to inform that the number is not valid.“The medium is XX.XX” to show the result.
'''
sumas = 0
i = 0
numaintroducir = int(input("How many numbers do you want input?"))
while numaintroducir>i:
    num = int(input("Enter one number greater than 0:"))
    if num<0:
        print("The number is not valid, it should be greater than 0")
        num = int(input("Enter one number greater than 0:"))
    if num>0:
        i = i+1
        sumas += num
print(sumas/numaintroducir)












