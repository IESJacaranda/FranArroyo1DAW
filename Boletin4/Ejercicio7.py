'''
Created on 27 Nov 2020
@author: estudiante
'''
# cadena="Estimado nombre apellido"
# remplazador="Francisco Arroyo"
# cadenanueva=replace(cadena,remplazador)
# print(cadenanueva)

def remplazador(frase):
    ifrase=0
    cadenanueva=""
    while ifrase<len(frase):
        if frase[ifrase]=="S" and frase[ifrase+1]=="r":
            ifrase+=1
            cadenanueva=frase.replace("Sr","Francisco")
        print(cadenanueva)
    return cadenanueva
print(remplazador("Estimado Sr"))

