'''
Created on 25 Nov 2020

@author: estudiante
6.Realizar una función que busque una palabra escondida dentro de un texto. 
Por ejemplo, si la cadena es “shybaoxlna” y la palabra que queremos buscar es “hola”, 
entonces si se encontrará y deberá devolver True, en caso contrario deberá devolver False.
'''
'''
Created on 26 nov. 2020

@author: fran
'''
# cadena="shybaoxlna"
# busqueda="hola"
# def buscadorr(cadena):
#     contadorbusqueda=0
#     contadorcadena=0
#     while contadorbusqueda<len(busqueda) and contadorcadena<len(cadena):
#         letracadena=len(cadena)
#         letrabusqueda=len(busqueda)
#         if letrabusqueda==letracadena:
#             contadorbusqueda+=1
#             contadorcadena+=1
#         else:
#             contadorcadena+=1
#     if contadorcadena==len(cadena):
#         return True
# print(buscadorr(cadena))
# def buscador(cadena):
#     resultado=""
#     i=0
#     j=0
#     while busqueda!=resultado:
#         if cadena[i]==busqueda[j]:
#             i+=1
#             j+=1
#             resultado=+j
#         else:
#             i+=1
#     return True
# print(buscador(cadena))


def correccion(frase,palabra):
    ipalabra=0
    ifrase=0
    while ifrase<len(frase):
        if ipalabra<len(palabra) and frase[ifrase]==palabra[ipalabra]:
            ipalabra+=1
        ifrase+=1
    resultado=ipalabra==len(palabra)
    return resultado
    
print(correccion("shybaoxlna", "hola"))















