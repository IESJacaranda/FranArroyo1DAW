'''
Created on 3 Nov 2020

@author: xXxArroyoxXx
'''
# Design a program that asks for numbers until the user inputs a negative one.
# Whenthis   happens,   the   program   will   show   how   many   positive   numbers   
# have   beenintroduced by the user. The messages are the following:
# “Enter a number (negative to finish):”
# “You have entered XX positive numbers.”
def ContadorPositivos(num):
    i = 0
    while num>=0:
        if num>=0:
            i += 1
            num = int(input("Introduce un numero"))
    print("Has introducido "+str(i)+" positivos")
ContadorPositivos(num=int(input("Introduce un numero")))