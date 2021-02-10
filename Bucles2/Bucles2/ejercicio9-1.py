'''
Created on 11 Nov 2020

@author: xXxArroyoxXx
'''
#Design a program that reads an integer positive number greater than 0 and says if "its a 
#perfect number" A number is perfect if it is equal to the sum of all its divisors.
#The messages are the following:
#"Enter an integer positive number greater than 0:"
#"The number is not valid, try again."
#"The number is perfect."
#"The number is not perfect.
def comprobacionNum():
    num = int(input("introduzca un numero:"))
    while num<=0:
        print("Mete un numero mas grande que el 0")
        num = int(input("introduzca un numero:"))
    else:
        #print(NumeroPerfecto(num))
        if NumeroPerfecto(num)==True:
            print("El "+str(num)+" perfecto")
        else:
            print("El "+str(num)+ " no es perfecto")    
def NumeroPerfecto(num):
    suma=0
    for i in range(1,num):
        if (num%i==0):
            suma+=i
    return suma==num
comprobacionNum()