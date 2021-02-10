'''
Created on 25 Nov 2020

@author: estudiante
'''
'''
1.Design a function called charactersInString that has a character string 
and a character as input parameters and returns how many times that character appears 
in the string. It should do if the string and character are  lower 
case or upper case characters
'''
"A".islower()
"A".isupper()
def charactersInString(cadenatexto):
    caracter=input("Que letra quieres buscar")
    numvecesletras=1
    for caracter in cadenatexto:
        if cadenatexto.islower()==caracter:
            numvecesletras+=1
    return (numvecesletras)
print(charactersInString(cadenatexto=input("Introduce la palabra o texto")))





def prueba(cadena,caracter):
    count=0
    for i in range(0,len(cadena)):
        if caracter.lower()==cadena[i].lower():
            count+=1
    print(cadena[i])








