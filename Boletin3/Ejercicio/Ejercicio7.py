'''
Created on 19 Nov 2020

@author: xXxArroyoxXx

7.Escriba una función que reciba un entero y devuelva si representa un 
año bisiesto o no, según la regla, “Un año es bisiesto si es divisible por 400, 
o bien si es divisible por 4 pero nopor 100” .
Por ejemplo, el año 2000 es bisiesto (es divisible por 400),
 el año 1992 es bisiesto (es divisible por 4 y no por 100), 
 y el año 2100 no es bisiesto (es divisible por 4 y también por 100 y no por 400).
'''
def pidedato():
    ano=int(input("Introduce el año deseado"))
    while ano==0:
        print("Año incorreco, porfavor introduzca un año mayor a 0")
        ano=int(input("Introduce el año deseado"))
    return calculabisiesto(ano)
def calculabisiesto(ano):
    if ano%4==0 and (ano%100!=0 or ano%400==0):
        mensaje="Es bisiesto"
    else:
        mensaje="No es bisiesto"
    return mensaje

print(pidedato())
