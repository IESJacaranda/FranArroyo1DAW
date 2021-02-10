'''
Created on 19 Nov 2020

@author: estudiante

6.Realizar un programa que solicite tres
 valores de los lados de un posible triángulo 
 e informe si es un triángulo o no.
'''
def pidedatos():
    lado1=int(input("Introduce el primer lado"))
    lado2=int(input("Introduce el segundo lado"))
    lado3=int(input("Introduce el tercer lado"))
    while lado1<=0 or lado2<=0 or lado3<=0:
        if lado1<=0:
            lado1=int(input("Introduce el primer lado"))
        if lado2<=0:
            lado2=int(input("Introduce el segundo lado"))
        if lado3<=0:
            lado3=int(input("Introduce el tercer lado"))
    return tipotriangulo(lado1, lado2, lado3)
def tipotriangulo(lado1,lado2,lado3):
    if (lado1+lado2>lado3) and (lado1+lado3>lado2) and (lado2+lado3>lado1):
        print("Es un triangulo")
        if lado1==lado2 and lado1==lado3:
            mensaje="Es Equilatero"
        elif lado1!=lado2 and lado1!=lado3:
            mensaje="Es escaleno"
        else:
            mensaje="Es isoceles"
        return mensaje
    else:
        mensaje="No es un triangulo"
        return mensaje
print(pidedatos())
            