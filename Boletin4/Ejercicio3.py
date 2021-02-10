'''
Created on 25 Nov 2020

@author: xXxArroyoxXx
'''
'''
3.Design a function called upperCaseInString that has a string of characters as parameter,
the method should return how many of those characters are upper case letters.
'''
def upperCaseInString(cadenatexto):
    mayusculas=[]
    for i in cadenatexto:
        if i.isupper():
            mayusculas.append(i)
    return (mayusculas)
print(upperCaseInString(cadenatexto=input("Introduce la palabra o texto")))