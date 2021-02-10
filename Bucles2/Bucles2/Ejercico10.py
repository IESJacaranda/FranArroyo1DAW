'''
Created on 3 Nov 2020

@author: xXxArroyoxXX
'''
# 10.Design a program that reads an integer positive number and says the “factorial” ofthe number. 
# To calculate the factorial you should know that
# FACT(0)= 1
# FACT(1) =1
# FACT(N)= N*(N-1)*(N-2)*....1
# The messages are the following:
# “Enter an integer positive number:”
# “The number is not valid, try again.”
# “The factorial is XX”
def factoriall (num):
    factorial = 1
    if num < 0:
        print("No existen factoriales negativos")
    else:
        for i in range(1,num+1):
            factorial = factorial*i
    return "El factorial de "+str(num)+" es ",str(factorial)
print(factoriall(num=int(input("introduce un numero")))