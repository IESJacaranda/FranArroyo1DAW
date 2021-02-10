'''
Created on 17 Nov 2020
@author: xXxArroyoxXx
'''
'''
2.Diseñar un programa que pida dos números, la base y la potencia, 
y muestre el resultado de elevar la base a la potencia sin usar 
el operador de potencia, es decir, sólo con multiplicaciones.
 Hay que tener en cuenta que la potencia puede ser negativa
'''
def calculapotencia(base,exponente):
    contador=1
    elevado=1
    if exponente>0:
        while contador <= exponente:
            elevado*=base
            contador=contador + 1
        return elevado
    elif exponente<0:
        contador=-1
        while contador >= exponente:
            elevado*=base
            contador=contador - 1
        return (1/elevado)

#base=int(input("Introduce la base"))
#exponente=int(input("Introduce el exponente"))
#print(calculapotencia(base, exponente))

assert(calculapotencia(2, 10)==1024)
assert(calculapotencia(-2, -2)==0.25)
assert(calculapotencia(10, 4)==10000)
assert(calculapotencia(2, 10)==1024)


