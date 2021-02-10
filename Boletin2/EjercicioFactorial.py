'''
Created on 15 oct. 2020

@author: xXxArroyoxXx
'''
import math
factorial=1
#El factorial debe ser asignado a 1 porque si lo pones a cero, todo lo que multipliques
#por cero da cero, por lo tanto te devolveria 0
numero=int(input("Introduce el numero a hacer el factorial"))
for i in range (1,numero+1):
    factorial=factorial*i
print(factorial)
#Creamos un for y el rango debe ir desde 1 hasta el mismo numero porque si no multiplica un numero menos
#por la posicion.
#Luego usamos una variable llamada factorial para multiplicar por la i pues la i recorre ese 
#rango mientras se asigna el mismo numero, de esta forma el valor se va acumulando y obtenemos
#el factorial pues el factorial de 5 con la formula seria 5*4*3*2*1=120


print(math.factorial(5))