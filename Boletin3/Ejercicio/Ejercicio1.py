'''
Created on 17 Nov 2020

@author: estudiante
'''
'''
1.Diseñar un programa que calcule el perímetro de una figura geométrica. 
Para ello debemos preguntar 
“¿Cuántos lados tiene la figura?”. 
Luego debemos pedir la longitud de cada uno de los lados 
y mostrar el perímetro. 
Se debe garantizar que los datos son correctos.
'''
def pedirlados ():
    lados=int(input("Introduce el numero de lados"))
    while 0>=lados:
        lados=int(input("Introduce la longitud de los lados"))
    lado=[]
    for i in range(1,lados+1):
        ladoss=int(input("Introduce el lado"))
        lado.append(ladoss)
        sumadeloslados=sumalados(lado)
    for i in range (1,len(lado)):
        if lado[i]>=0:
            print("El perimetro es de :"+str(sumalados(lado)))
    for i in range(0,len(lado)):
        suma=0
        for j in range(0,len(lado)):
            if j!=i:
                suma=suma+j
        if suma<=i:
            print("No es un poligono")
                
def sumalados(lado):
    sumalados=0
    for i in lado:
        sumalados=sumalados+i
    return sumalados

print(pedirlados())
