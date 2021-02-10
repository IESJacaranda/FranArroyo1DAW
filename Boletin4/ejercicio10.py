# '''
# Created on 1 Dec 2020
# 
# @author: estudiante
# '''
# '''
# Created on 29 nov. 2020
# 
# @author: fran
# '''
# 
cadena="He estudiado mucho"
# def contartexto(cadena):
#     numeropalabras=0
#     for i in cadena:
#         caracter=cadena.join(i)
#         if str(caracter)==" ":
#             numeropalabras+=1
#     return numeropalabras
# # def contarrcosas(cadena):
# #     numeropalabras=0
# #     for i in cadena:
# #     return numeropalabras 
# print(contartexto(cadena))
# def ccontartexto(cadena):
#     listapalabras=[]
#     contadorcadena=0
#     contadorpalabra=0
#     while contadorcadena<len(cadena):
#         if cadena[contadorcadena]==" ":
#             contadorcadena+=1
#         else:
#             palabra=""
#             for i in range(contadorcadena,len(cadena)):
#                 palabra+=cadena[i]
#                 listapalabras.append(palabra)
#             contadorcadena+=1
#     return len(listapalabras)
# print(ccontartexto(cadena))
def cccontartexto(cadena):
    listapalabras=[]
    contadorcadena=0
    contadorpalabra=0
    while contadorcadena<len(cadena):
        for i in range(contadorcadena,len(cadena)):
            if cadena[i]==" ":
                contadorcadena+=1
            else:
                palabra=""
                palabra+=cadena[i]
                listapalabras.append(palabra)
            contadorcadena+=1
    return listapalabras
print(cccontartexto(cadena))