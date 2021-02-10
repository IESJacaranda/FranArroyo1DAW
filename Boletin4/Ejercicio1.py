'''
Created on 25 Nov 2020

@author: estudiante
'''
# def palidromeono(palabra):
#     comparacion=""
#     for i in palabra:
#         comparacion=i+comparacion
#     if (palabra==comparacion):
#         return "Es palindrome"
#     else:
#         return "No es palindrome"
# palabra="aman a panama"
# print(palidromeono(palabra))
#Funciona si todo esta junto, no se como hacer los espacios :(
# def palindrome(cadena):
#     inversa=""
#     for i in cadena:
#         inversa=i+inversa
#     if inversa==cadena:
#         return True
#     else:
#         return False
def palindrome(cadena):
    for i in range(0,len(cadena)//2):
        soniguales=(cadena[i]==cadena[len(cadena)-1-i])
    if soniguales:
        palindromesono=True
    else:
        palindromesono=False
    return palindromesono
print(palindrome("anana"))
print(palindrome("amolapaloma"))
print(palindrome("Cualquier cadena saludos"))










