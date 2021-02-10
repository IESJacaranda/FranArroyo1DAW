'''
Created on 17 nov. 2020

@author: xXxArroyoxXx
'''
'''
3.Disenar un programa que lea numeros hasta que el usuario introduzca el 0.
Debe informar dela media de los numeros leidos (sin tener en cuenta el 0)
 y el valor maximo y minimo introducido
'''
#print("El numero %s esmenor que %s" % (3,3))
def contadornums():
    suma=0
    i=0
    mayor=0
    menor=0
    num=int(input("Introduce un numero"))
    while 0!=num:
        if num<0:
            print("Numero incorrecto")
            num=int(input("Introduce un numero"))
        else:
            suma+=num
            i+=1
            if num>mayor:
                mayor=num
            elif num<=menor:
                menor=num
            num=int(input("Introduce un numero"))
    #return suma/i,mensajemayor,mensajemenor
    return "El maximo es :%s , el menor :%s y la media: %s"%(mayor,menor,suma/i)
print(contadornums())











