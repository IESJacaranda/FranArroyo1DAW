'''
Created on 10 Dec 2020

@author: estudiante
Design a method called secondOrder that receives three integer positive number as parameters. 
This parameters are the coefficients of the an equation of a second order (ax2+bx+c=0) and the
 method returns the numbers of the solutions. If the parameters are not valid the method should return -1
'''
import math
def secondOrder(a=1,b=10,c=9):
    x=(b**2)-(4*a*c)
    if x==0:
        solucion1=(-b)/(2*a)
        return "Una solucion"+str(solucion1)
    else:
        solucion1=(-b+math.sqrt(solucion1)/(2*a))
        solucion2=(-b-math.sqrt(x)/(2*a))
        return "Dos soluciones"+str(solucion1)+" y "+str(solucion2)
    
print(secondOrder())