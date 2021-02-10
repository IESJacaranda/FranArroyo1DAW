'''
Created on 26 Nov 2020

@author: estudiante
8.Diseñar una función que determine la cantidad de vocales diferentes, 
que tiene una palabra o frase introducida por teclado.
 Por ejemplo, la cadena “Abaco”, devolvería 2.
 '''
def cantidadvocal():
    cadena="Tau"
    contadorA=0
    contadorE=0
    contadorI=0
    contadorO=0
    contadorU=0
    for i in cadena.upper():
        if i=="A":
            contadorA=1
        elif i=="E":
            contadorE=1
        elif i=="I":
            contadorI=1
        elif i=="O":
            contadorO=1
        elif i=="U":
            contadorU=1
    return contadorA+contadorE+contadorI+contadorO+contadorU

print(cantidadvocal())