'''
Created on 3 Nov 2020

@author: xXxArroyoxXX
'''
# 8.Design a program that asks for a set of numbers. After inputting each number, 
# theprogram should ask “Do you want to enter more numbers (Y/N)?”.
#  If the answer is “Y”the program asks for other numbers. 
#  When the user finishes to enter all the numbers,the program should say which one is the smallest. 
#  The messages are the following:
# “Enter one number:”
# “Do you want to enter more number (Y/N)?”
# “The smallest number is XX”
i=0
menor=0
numaintroducir=int(input("Cuantos numeros quieres introducir"))
while numaintroducir!=i:
    num=int(input("Introduce un numero"))
    if numaintroducir==i:
        respuesta=str(input("Do you want to enter more number (Y/N)"))
        if respuesta=="Y":
            numaintroducir=1
            i=1
        else:
            i=numaintroducir
    if num<menor:
        menor=num
        i+=i
        i+=i