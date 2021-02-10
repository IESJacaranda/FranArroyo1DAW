'''
Created on 18 nov. 2020

@author: xXxArroyoxXx

5.Realizar un programa que solicite la coordenada x e y de un punto 
e informe si se encuentre en el primer, segundo, tercer o cuarto cuadrante.
'''
def pedirDatos():
    x=int(input("Introduce las cordenadas en X"))
    y=int(input("Introduce las cordenadas en Y"))
    return calculo(x,y)
def calculo(x,y):
    if x==0 and y==0:
        mensaje="Esta en el origen"
    elif x==0 or y==0:
        mensaje="Esta en el eje"
    elif (x>0) and (y>0):
        mensaje="Punto en el primer cuadrante"
    elif (x>0) and (y<0):
        mensaje="Punto en el segundo cuadrante"
    elif (x<0) and (y<0):
        mensaje="Punto en el tercer cuadrante"
    elif (x<0) and (y>0):
        mensaje="Punto en el cuarto cuadrante"    
    return mensaje
print(pedirDatos())