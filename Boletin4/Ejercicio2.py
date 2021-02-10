'''
Created on 25 Nov 2020

@author: xXxArroyoxXx
'''
'''
2.Design a function called lowCaseInString that has a 
string of characters as parameter,
 the method should return how many of those 
 characters are lowcase letters.
'''
def lowCaseInString(cadenatexto):
    minusculas=[]
    for i in cadenatexto:
        if i.islower():
            minusculas.append(i)
    return (minusculas)
print(lowCaseInString(cadenatexto=input("Introduce la palabra o texto")))