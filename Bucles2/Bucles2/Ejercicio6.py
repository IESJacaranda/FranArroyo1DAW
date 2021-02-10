'''
Created on 3 Nov 2020

@author: xXxArroyoxXx
'''
'''
Design   a  program  that   reads  two  integer   numbers,   
for  example   numberA  andnumberB, and calculates the product of 
both numbers without use multiplication, butusing the sum. 
The messages are the following:
“Enter one number:”
“The product is XX”
'''
na = int(input("Enter one number:"))
nb = int(input("Enter one number:"))
def multiplicar(na,nb):
    if nb==0:
        return 0
    else:
        return na+multiplicar(na,nb-1)
print(multiplicar(na,nb))
