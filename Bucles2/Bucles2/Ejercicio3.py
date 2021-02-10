'''
Created on 3 Nov 2020

@author: xXxArroyoxXx
'''
'''
Design a program that asks how many numbers the user wants to introduce.
Then,the user would have to introduce the numbers one by one and the program shouldsay 
if each one of the numbers is odd or even. If the user inputs 0 or a negativenumber, 
it is not valid, and the system should ask for another number.
The messagesare the following:“How many numbers do you want input?” 
to ask for the number of numbers.“Enter one number greater than 0:” 
to ask for a number.“The number is not valid, 
it should be greater than 0” to inform that the number is notvalid.
“The number XX is odd”“The number XX is even
'''
impar = 0
par = 0
i = 0
numaintroducir = int(input("How many numbers do you want input?"))
while i!=numaintroducir:
    if numaintroducir<0:
        i = numaintroducir
    else:
        num = int(input("Enter one number greater than 0:"))
        if num<=0:
            print("The number is not valid, it should be greater than 0”")
        else:
            if num%2==0:
                print("The number "+str(num)+" is even”")
                i += 1
                par += 1
            else:
                print("The number "+str(num)+" is odd”")
                i += 1
                impar += 1
print("There are "+str(par)+" even number and "+str(impar)+" odd number")
