'''
Created on 9 dic. 2020

@author: fran
Design a method called myPower that receives one integer and one integer 
positive numbers as parameters and the method calculates the power of the 
first parameter raised the second number. You only can use the multiplication. 
If the parameters are not right (the second parameter is negative) the method should return -1. 
Remember that any number raised 0 is 1.
'''
def mypower(base, exponente):
    resto=1
    if exponente==0:
        resto=1
    else:
        while exponente >= 1:
            resto=resto*base
            exponente=exponente-1
    return resto
print(mypower(5, 2))