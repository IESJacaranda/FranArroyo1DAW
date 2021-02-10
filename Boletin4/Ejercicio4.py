'''
Created on 25 Nov 2020

@author: xXxArroyoxXx

4.Design a function called numberInString that has a string of characters as parameter,
 the method should return how many of those characters are numbers.
'''
def numberInString(cadenatexto):
    numeros=[]
    for i in cadenatexto:
        if i.isnumeric():
            numeros.append(i)
    return len(numeros)
print(numberInString(cadenatexto=input("Introduce la palabra o texto")))