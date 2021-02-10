'''
Created on 4 Nov 2020

@author: estudiante
'''
'''
9.Design a program that reads an integer positive number greater than 0 
and says ifit’s a “perfect number”. A number is perfect if it is equal to 
the sum of all its divisors.The messages are the following:
“Enter an integer positive number greater than 0:”
“The number is not valid, try again.”
“The number is perfect.”
“The number is not perfect.
'''
num1=int(input("Introduzca el primer numero"))
i=1
j=0
mcm=0
for i in range(i,1000000,1):
    if num1%i==0:
        mcm=i
        print(str(i)+"Estos son sus maximos")
    j+=mcm
    if j==num1:
        print("Es numero perfecto")